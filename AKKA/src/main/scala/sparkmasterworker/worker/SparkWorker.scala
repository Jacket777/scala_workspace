package sparkmasterworker.worker

import java.util.UUID
import akka.actor.{Props, ActorSystem, ActorSelection, Actor}
import com.typesafe.config.ConfigFactory
import scala.concurrent.duration._
import sparkmasterworker.common.{SendHeartBeat, HearBeat, RegisteredWorkerInfo, RegisterWorkerInfo}

/**
  * Created by 17081290 on 2020/7/9.
  */
class SparkWorker(masterUrl: String) extends Actor {
  var masterProxy: ActorSelection = _
  val workerId = UUID.randomUUID().toString
  override def preStart(): Unit = {
    masterProxy = context.actorSelection(masterUrl)
  }
  override def receive: Receive = {
    case "start" => { // 自己已就绪
      println(workerId + " 向master发出注册信息... ")
      masterProxy ! RegisterWorkerInfo(workerId, 1, 64 * 1024) //
    }

    case RegisteredWorkerInfo => { //SparkWorker.scala
      println(workerId + " 向master注册成功了... ")
      println(workerId + " 准备开始定时发送心跳消息给master... ")
      import context.dispatcher
      context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHeartBeat)
    }
    case SendHeartBeat => {
      // 向master发送心跳了
      println(s"------- $workerId 发送心跳-------")
      masterProxy ! HearBeat(workerId)
    }




    case RegisteredWorkerInfo => {
      println(workerId + " 向master注册成功了... ")
    }}}

object SparkWorker {
  def main(args: Array[String]): Unit = {
    if(args.length != 4) {
      println("请输入参数：host port workerName masterURL")
      sys.exit() // 退出程序
    }
    //定义连接master相关变量, 后面改成参数输入(这样更加灵活)
    val host = args(0) //"127.0.0.1"
    val port = args(1) //10002
    // "akka.tcp://sparkMaster@127.0.0.1:10001/user/master-01"
    val masterURL = args(2)
    val workerName = args(3) //"worker-01"

    //val host = "127.0.0.1"
    //val port = 10002
    //val masterURL = "akka.tcp://sparkMaster@127.0.0.1:10001/user/master-01"
   // val workerName = "worker-01"
    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=127.0.0.1
         |akka.remote.netty.tcp.port=10002
            """.stripMargin)
    val actorSystem = ActorSystem("sparkWorker", config)
    val workerActorRef = actorSystem.actorOf(Props(new SparkWorker(masterURL)), workerName)
    workerActorRef ! "start"
  }}

