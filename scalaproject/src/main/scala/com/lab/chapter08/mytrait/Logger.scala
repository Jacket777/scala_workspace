package com.lab.chapter08.mytrait

/**
  * Created by 17081290 on 2020/6/22.
  * 说明：
  * 1.特质中没有实现的方法就是抽象方法。类通过extends继承特质，通过with可以继承多个特质
  * 2.所有的java接口都可以当做Scala特质使用
  */
trait Logger {
  def log(msg:String)
}

class Console extends Logger with Cloneable with Serializable{
  override def log(msg: String): Unit = {
    println(msg)
  }
}