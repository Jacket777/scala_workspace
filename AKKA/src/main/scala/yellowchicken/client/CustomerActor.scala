package yellowchicken.client

import akka.actor._
import akka.actor.Actor.Receive
import com.typesafe.config.ConfigFactory
import yellowchicken.common.{ServerMessage, ClientMessage}

import scala.io.StdIn

/**
  * Created by 17081290 on 2020/7/10.
  */
class CustomerActor(serverHost:String,serverPort:Int) extends Actor{
  //定义一个YellowChickenServerRef
  var serverActorRef:ActorSelection = _
  //在Actor中有一个PreStart方法，它会在Actor运行前执行
  //在ak开发中，通常将初始化工作，放在preStart方法中
  override def preStart(): Unit ={
    println("======start=========")
    serverActorRef = context.actorSelection(s"" +
      s"akka.tcp://Server@${serverHost}:${serverPort}/user/YellowChickenServer")
    println("serverActorRef ="+serverActorRef)
  }

  override def receive: Receive = {
    case "start" => println("start 客户端，可以咨询问题")
    case mes:String =>{
      //发给小黄鸡客服
      serverActorRef ! ClientMessage(mes)  //使用ClientMessage case class的apply方法
    }
    //如果接受到服务回复
    case ServerMessage(mes) =>{
      println("接受到客服的回复 "+mes)


  }



  }
}




//主程序入口
object CustomerActor extends App{
  val(clientHost,clientPort,serverHost,serverPort)=("127.0.0.1",9990,"127.0.0.1",9999)
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$clientHost
       |akka.remote.netty.tcp.port=$clientPort
        """.stripMargin)
  //创建ActorSystem
  val clientActorySystem = ActorSystem("client",config)
  //创建CustomerActor的实例与引用
  val customerActorRef:ActorRef =clientActorySystem.actorOf(Props(new CustomerActor(serverHost,serverPort)),
    "CustomerActor")
  //启动
  customerActorRef ! "start"

  //客户端可以发消息给服务器
  while(true){
    println("请输入要咨询的问题")
    val mes = StdIn.readLine()
    customerActorRef ! mes

  }







}
