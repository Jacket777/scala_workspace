package com.lab.chapter13.unit06_closure

/**
  * Created by 17081290 on 2020/7/6.
  * 清单 13.6.1.闭包的简单入门
  *
  */
object ClosureDemo01 {
  def main(args: Array[String]) {
    /**
      * 说明
      * 1.(y:Int)=>x-y 返回的是一个匿名函数，因为该函数引用到函数外的x,
      * 那么函数和x整体形成一个闭包，这里val f = minusxy(20)的f函数就是闭包
      * 2.理解：返回的函数是一个对象，而x就是该对象的一个字段，他们共同形成一个闭包
      * 3.当多次调用f时，（可以理解多次调用闭包）,发现使用的是同一个x，所有x不变
      * 4.在使用闭包时，主要搞清楚返回函数引用了函数外哪些变量，因为他们会组合成一个整体（实体）
      * 形成一个闭包
      *
      * @param x
      * @return
      */

    def minusxy(x:Int)=(y:Int)=>x-y
    val f = minusxy(20)
    println("f(1) = "+f(1))
    println("f(2) = "+f(2))
  }
}


