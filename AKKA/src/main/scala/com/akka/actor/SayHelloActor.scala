package com.akka.actor

import akka.actor.{Props, ActorRef, ActorSystem, Actor}
import akka.actor.Actor.Receive

/**
  * Created by 17081290 on 2020/7/9.
  */
class SayHelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("收到hello 回应hello too")
    case "ok" => println("收到ok,回应OK too")
    case "exit" =>{
      println("接受到 exit指令，退出系统")
      context.stop(self)
      context.system.terminate()
    }
    case _ =>println("匹配不到")
  }
}

object SayHelloActorDemo{
  private val actoryFactory = ActorSystem("actorFactory")
  private val sayHelloActorRef:ActorRef =actoryFactory.actorOf(Props[SayHelloActor],"sayHelloActor")

  def main(args: Array[String]) {
    sayHelloActorRef !"hello"
    sayHelloActorRef !"ok"
    sayHelloActorRef !"ok~"
    sayHelloActorRef ! "exit"


  }




}
