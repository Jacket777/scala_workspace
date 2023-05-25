package com.lab.chapter11.unit05_fold

/**
  * Created by 17081290 on 2020/6/26.
  * foldLeft和foldRight 缩写方法分别是：/:和:\
  */
object FlodDemo02 {
  def main(args: Array[String]) {
    val list4 = List(1, 9, 2, 8)

    var i6 = (1 /: list4) (minus) // =等价=> list4.foldLeft(1)(minus)
    println(i6) // 输出?
    i6 = (100 /: list4) (minus)
    println(i6) // 输出?
    i6 = (list4 :\ 10) (minus) // list4.foldRight(10)(minus)
    println(i6) // 输出?

  }
  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

}
