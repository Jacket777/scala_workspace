package com.lab.chapter14

/**
  * Created by 17081290 on 2020/7/7.
  */
object RecursiveFa {
  def main(args: Array[String]) {
    println("5! = "+factorial(5))
  }

  //求阶乘
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

}
