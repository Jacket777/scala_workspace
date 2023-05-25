package sparkworker.master

import akka.actor.{Props, ActorSystem, Actor}
import akka.actor.Actor.Receive
import com.typesafe.config.ConfigFactory
import sparkmasterworker.common.{RemoveTimeOutWorker, RegisteredWorkerInfo, RegisterWorkerInfo, WorkerInfo}
import sparkworker.comm.{SendHeartBeat, StartTimeOutWorker, HeartBeat}

import scala.collection.mutable
import scala.concurrent.duration._


/**
  * Created by 17081290 on 2020/7/10.
  */
class SparkMaster extends Actor{
  //定义HASH MAP管理worker
  val workers = mutable.Map[String,WorkerInfo]()
  override def receive: Receive = {
    case "start" => {
      println("master 服务器启动了....")
      //从这里开始
      self !StartTimeOutWorker
    }
    case RegisterWorkerInfo(id,cpu,ram) =>{
      //接受到worker注册信息
      if(!workers.contains(id)){
        //创建workerInfo对象
        val workerInfo = new WorkerInfo(id,cpu,ram)
        //加入到workers
        workers+=((id,workerInfo))
        println("服务器的workers ="+workers)
        //回复消息，注册成功
        sender()! RegisteredWorkerInfo
      }
    }

    case HeartBeat(id)=>{
      //更新对应的worker心跳时间
      //1.从wokers 取出 WorkerInfo
      val workerInfo = workers(id)
      workerInfo.lastHeartBeatTime = System.currentTimeMillis()
      println("master 更新了 "+id+" 心跳时间")
    }

    case StartTimeOutWorker =>{
       println("开始定时检测worker 心跳任务")
      import context.dispatcher
      //说明：
      //1.0 millis 不延时，立即执行定时器
      //2. 3000 millis 表示每隔3秒执行一次
      //3.self:表示发送给自己
      //4.SendHeartBeat 发送内容
      context.system.scheduler.schedule(0 millis,9000 millis,self,RemoveTimeOutWorker)
    }

     //对RemoveTimeOutWorker消息处理
      //这里需要检查哪些worker心跳超时now-lastheartbeat>6000，从map中删除
    case RemoveTimeOutWorker => {
      //首先将workers的所有workInfo取出
      val workerInfos = workers.values
      val nowTime = System.currentTimeMillis()
      //先把超时的worker取到，删除掉
      workerInfos.filter(workerInfo=>(nowTime-workerInfo.lastHeartBeatTime) >6000).
        foreach(workerInfo=>workers.remove(workerInfo.id)
      )
      println("当前有 "+workerInfos.size+" worker活着")



    }

  }
}



object SparkMaster{
  def main(args: Array[String]) {
    //运行时指定参数--分析出有三个参数需要运行执行--host,port,sparkmasterActor
    if(args.length !=3){
      println("请输入参数 host,port,sparkMasterActor 名字")
      sys.exit()
    }

    val host = args(0)
    val port = args(1)
    val name = args(2)


    //创建config对象,指定协议类型，监听的ip和端口
    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=${host}
         |akka.remote.netty.tcp.port=${port}
        """.stripMargin)
    val sparkMasterSystem = ActorSystem("SparkMaster",config)
    //创建spark master -actor
    val sparkMasterRef = sparkMasterSystem.actorOf(Props[SparkMaster],s"${name}")
    sparkMasterRef ! "start"





  }

  



}


