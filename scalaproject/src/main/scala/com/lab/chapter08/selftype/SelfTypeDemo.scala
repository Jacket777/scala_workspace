package com.lab.chapter08.selftype

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.14
  * 特质 自身类型
  * 解决问题：特质的循环依赖问题，同时可以确保特质在不扩展某个类的情况下，
  * 依然可以做到限制混入该特质的类的类型
  */
object SelfTypeDemo {
  def main(args: Array[String]) {
      println("==========")
  }

}


trait Logger{
  //明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this:Exception=>
  def log(): Unit ={
    //既然我就是Exception，就可以调用其中的方法
    println(getMessage())
  }

}


//class Console2 extends  Logger{}//错误
class Console extends Exception with Logger{}  //正确