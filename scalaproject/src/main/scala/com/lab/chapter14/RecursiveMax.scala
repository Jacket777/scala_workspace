package com.lab.chapter14

/**
  * Created by 17081290 on 2020/7/7.
  */
object RecursiveMax {
  def main(args: Array[String]) {
    println(mymax(List(1)))
    println(mymax(List(1,3,-1)))

  }
  //求递归最大值
  def mymax(xs: List[Int]): Int = {
    if (xs.isEmpty)
      throw new java.util.NoSuchElementException
    if (xs.size == 1)
      xs.head
    //递归是告诉计算机做什么，而不是怎么做
    else if (xs.head > mymax(xs.tail)) xs.head else mymax(xs.tail)
  }
}
