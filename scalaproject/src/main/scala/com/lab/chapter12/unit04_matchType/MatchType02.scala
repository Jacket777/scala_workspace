package com.lab.chapter12.unit04_matchType

/**
  * Created by 17081290 on 2020/7/8.
  */
object MatchType02 {
  def main(args: Array[String]) {
    val value = 1
    val obj = if(value == 1) 1
    else if(value == 2) "2"
    else if(value == 3) BigInt(3)
    else if(value == 4) Map("aa" -> 1)
    else if(value == 5) Map(1 -> "aa")
    else if(value == 6) Array(1, 2, 3)
    else if(value == 7) Array("aa", 1)
    else if(value == 8) Array("aa")

    /**
      * 说明：
      * 1.Map[String, Int] 和Map[Int, String]是两种不同的类型
      * 2. case a : Int => a  表示 将 a = obj (其它类推)，然后再判断类型
        3.如果 case _ 出现在match 中间，则表示隐藏变量名，即不使用,而不是表示默认匹配。

      */

    val result1 = obj match {
      case a : Int =>a
      case _ : BigInt => Int.MaxValue
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case _ => "啥也不是"
    }
    println("result1 = "+result1)
  }

}
