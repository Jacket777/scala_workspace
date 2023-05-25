package com.lab.chapter05.procedure

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.4.1
  * 过程实例
  */
object procedureDemo01 {
  def main(args: Array[String]) {
    f10("Jack ")

  }

  def f10(name:String):Unit={
    println(name+" hello")
  }

}
