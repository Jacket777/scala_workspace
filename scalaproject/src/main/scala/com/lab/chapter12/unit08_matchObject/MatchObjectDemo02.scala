package com.lab.chapter12.unit08_matchObject

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchObjectDemo02 {
  def main(args: Array[String]) {
    val namesString = "Alice,Bob,Thomas"
    //说明
    namesString match {
      case Names(first, second, third) => {
        println("the string contains three people's names")
        // 打印字符串
        println(s"$first $second $third")
      }
      case _ => println("nothing matched")
    }


  }
}

object Names {
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else None
  }}

