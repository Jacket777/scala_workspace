package com.lab.chapter12.unit09_matchvar

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchVarDemo {
  def main(args: Array[String]) {
    val (x, y) = (1, 2)
    val (q, r) = BigInt(10) /% 3  //说明  q = BigInt(10) / 3 r = BigInt(10) % 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr // 提出arr的前两个元素
    println(first, second)

  }

}
