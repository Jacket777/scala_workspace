package com.lab.chapter01


/**
  * 1.只要有object,则应该想到的是
  * A.object TestScala 对应的是一个TestScala$的对象MODULE$
  * B.在程序中,它是个单例
  */
object TestScala {
  def main(args: Array[String]) {
    println("hello")
  }
}
