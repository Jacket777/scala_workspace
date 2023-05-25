package com.akka.actor

import akka.actor.Actor

/**
  * Created by 17081290 on 2020/7/9.
  */
class BActor extends Actor { //BActor.scala
  var attack = 0
override def receive: Receive = {
  case "我打" => {
    println(s"BActor(乔峰): 挺猛的 看我降龙十八掌~ 第$attack 掌")
    Thread.sleep(1000)
    sender() ! "我打"
  }}}

