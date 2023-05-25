package com.lab.chapter14

/**
  * Created by 17081290 on 2020/7/7.
  */
object RecursiveRerStr {
  def main(args: Array[String]) {
    val str = "hello"
    println(reverse(str))



  }

  //Str = "ab" 翻转字符串
  def reverse(xs: String): String =
    if (xs.length == 1)
      xs  //如果长度为1，则直接返回
    else
      reverse(xs.tail) + xs.head  //如果长度大于1，则反转后面的

}
