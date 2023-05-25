package com.akka.actor

import akka.actor.{Props, ActorSystem}

/**
  * Created by 17081290 on 2020/7/9.
  */
object ActorsGame { //ActorsGame.scala
def main(args: Array[String]): Unit = {
  val actorFactory = ActorSystem("actorFactory")
  val bActorRef = actorFactory.actorOf(Props[BActor],"bActor")
  val aActorRef = actorFactory.actorOf(Props(new AActor(bActorRef)),"aActor")
  aActorRef ! "start"}}

