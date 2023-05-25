package com.lab.chapter12.unit04_matchType

/**
  * Created by 17081290 on 2020/6/29.
  * 类型匹配
  */
object MatchType01 {
  def main(args: Array[String]) {
    // 类型匹配, obj 可能有如下的类型
    val valule = 1
    var obj = if (valule == 1) 1
    else if (valule == 2) "2"
    else if (valule == 3) BigInt(3)
    else if (valule == 4) Map("aa" -> 1)
    else if (valule == 5) Map(1 -> "aa")
    else if (valule == 6) Array(1, 2, 3)
    else if (valule == 7) Array("aa", 1)
    else if (valule == 8) Array("aa")
    obj = 1

    /**
      * 说明：
      * 1.Map[String, Int] 和Map[Int, String]是两种不同的类型
      * 2. case a : Int => a  表示 将 a = obj (其它类推)，然后再判断类型
      */

    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println("result = "+result)


    println("================================")





    /**
      * 说明：
      * 在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错.
      */
    val obj2 = 10
    val result2 = obj2 match {
      case a : Int => a
      //case b : Map[String, Int] => "Map集合"  //加上这段会编译报错
      case _ => "啥也不是"
    }













  }

}
