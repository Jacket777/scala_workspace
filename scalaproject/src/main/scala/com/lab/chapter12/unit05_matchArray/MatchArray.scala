package com.lab.chapter12.unit05_matchArray

/**
  * Created by 17081290 on 2020/6/29.
  * 清单 12.5
  * 说明：
  * Array(0) 匹配只有一个元素且为0的数组。
Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
Array(0,_*) 匹配数组以0开始

  */
object MatchArray {
  def main(args: Array[String]) {
    var arr01 = Array(Array(0), Array(1, 0), Array(0, 1, 0),
      Array(1, 1, 0), Array(1, 1, 0, 1))
    for (arr <- arr01){
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(x,y,z) => x+"="+y+"="+z
        case Array(1, _*) => "以1开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }

  }

}
