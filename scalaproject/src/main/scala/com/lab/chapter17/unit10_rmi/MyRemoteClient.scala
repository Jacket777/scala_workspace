package com.lab.chapter17.unit10_rmi

import java.rmi.Naming

/**
  * Created by 17081290 on 2020/7/16.
  */
class MyRemoteClient {
  def go() = {
    val service = Naming.lookup("rmi://127.0.0.1:9999/RemoteHello").asInstanceOf[MyRemote]
    val str = service.sayHello()
    println("str = " + str)
  }}
object MyRemoteClient {
  def main(args: Array[String]): Unit = {
    new MyRemoteClient().go()
  }}

