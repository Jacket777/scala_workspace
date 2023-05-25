package sparkmasterworker.master

import akka.actor.{Props, ActorSystem, Actor}
import com.typesafe.config.ConfigFactory
import sparkmasterworker.common._

/**
  * Created by 17081290 on 2020/7/9.
  */
class SparkMaster extends Actor { //SparkMaster.scala
val workers = collection.mutable.HashMap[String, WorkerInfo]()
  override def receive: Receive = {
    case "start" => { //SparkMaster.scala
      println("master服务，启动并开始监听端口....")
      self ! StartTimeOutWorker
    }
    // 开启定时器，每隔一定时间检测是否有worker的心跳超时
    case StartTimeOutWorker => {
      import context.dispatcher // 使用调度器时候必须导入dispatcher
      //context.system.scheduler.schedule(0 millis, 9000 millis, self, RemoveTimeOutWorker)
    }
    case RemoveTimeOutWorker => {
      val workerInfos = workers.values
      val currentTime = System.currentTimeMillis()
      // 过滤心跳超时的worker
      workerInfos
        .filter(workerInfo => currentTime - workerInfo.lastHeartBeatTime > 6000)
        .foreach(workerInfo => workers.remove(workerInfo.id))
      println(s"-----还剩 ${workers.size} 存活的Worker-----")
    }


    case HearBeat(workerId) => { //SparkMaster.scala
    val workerInfo = workers(workerId)
      workerInfo.lastHeartBeatTime = System.currentTimeMillis()
      println(s"master：${workerId} 更新了心跳时间...")
    }


    case RegisterWorkerInfo(workerId, cpu, ram) => {
      if (!workers.contains(workerId)) {
        println(workerId + " 注册ok.... ")
        val workerInfo = new WorkerInfo(workerId, cpu, ram)
        workers += ((workerId, workerInfo))
        sender() ! RegisteredWorkerInfo
      }}}}

object SparkMaster {
  def main(args: Array[String]): Unit = {
    // 检验参数
    if(args.length != 3) {
      println("请输入参数：host port masterName")
      sys.exit() // 退出程序
    }
    val host = args(0)
    val port = args(1)
    val masterName = args(2)

    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=127.0.0.1
         |akka.remote.netty.tcp.port=10001
            """.stripMargin)
    val actorSystem = ActorSystem("sparkMaster", config)
    val masterActorRef = actorSystem.actorOf(Props[SparkMaster], "master-01")
    masterActorRef ! "start"
  }}

