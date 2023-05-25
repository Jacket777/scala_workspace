package com.lab.chapter10.unit04_queue

/**
  * Created by 17081290 on 2020/6/26.
  * 清单 10.5.2.运算符重载
  */
object OperatorOverload {
  def main(args: Array[String]) {
    val cat = new Cat
    cat +10
    cat.+(30)
    println("cat.age = "+cat.age)
  }
}

class Cat{
  var age = 0
  def +(n:Int): Unit ={
    this.age += n
  }
}
