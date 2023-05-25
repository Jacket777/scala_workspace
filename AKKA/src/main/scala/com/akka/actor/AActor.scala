package com.akka.actor

import akka.actor.AbstractActor.Receive
import akka.actor.{Actor, ActorRef}

/**
  * Created by 17081290 on 2020/7/9.
  */
class AActor(bActorRef: ActorRef) extends Actor { //AActor.scala
override def receive: Receive = {
  case "start" => {
    println("AActor(黄飞鸿) 开始游戏了")
    bActorRef ! "我打"}
  case "我打" => {
    println(s"AActor(黄飞鸿) 厉害 看我佛山无影脚~~~~ 第脚" )
    Thread.sleep(1000)
    bActorRef ! "我打"
  }}}

