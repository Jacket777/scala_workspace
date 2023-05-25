package yellowchicken.server

import akka.actor.{ActorRef, Props, ActorSystem, Actor}
import akka.actor.Actor.Receive
import com.typesafe.config.ConfigFactory
import yellowchicken.common.{ServerMessage, ClientMessage}

/**
  * Created by 17081290 on 2020/7/9.
  */
class YellowChickenServer extends Actor{
  override def receive: Receive = {
    case "start"=> println("客服开始工作了")
    //如果接收到clientMessage
    case ClientMessage(mes)=>{
      //使用match匹配
      mes match{
        case "大数据学费"=>sender()! ServerMessage("15000RMB")
        case "学校地址"=>sender()! ServerMessage("北京")
        case "学习什么技术"=>sender()!ServerMessage("大数据")
        case _ =>sender()!ServerMessage("你说的什么")
      }

    }
  }
}


//主程序
object YellowChickenServer extends App{
  val host = "127.0.0.1" //服务端ip地址
  val port = 9999
  //创建config对象,指定协议类型，监听的ip和端口
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$host
       |akka.remote.netty.tcp.port=$port
        """.stripMargin)
  //创建ActorSystem
  val serverActorSystem = ActorSystem("Server",config)
  //创建YellowChickenServer的actor 和返回actorRef
  val yellowChickenServerRef:ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer],"YellowChickenServer")
  //启动
  yellowChickenServerRef !"start"

}