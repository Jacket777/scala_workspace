package com.lab.chapter05.fun

/**
  * Created by 17081290 on 2020/5/30.
  * 清单 5.1.2
  * 函数运行原理
  *
  */
object FunDemo02 {
  def main(args: Array[String]) {
    val n1 = 1
    val n2 = 3
    println("res = "+sum(n1,n2))

  }

  def sum(n1:Int,n2:Int): Int ={
    return n1 + n2
  }

}
