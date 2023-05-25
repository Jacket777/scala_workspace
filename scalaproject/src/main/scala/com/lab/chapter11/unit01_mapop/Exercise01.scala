package com.lab.chapter11.unit01_mapop

/**
  * Created by 17081290 on 2020/6/26.
  * 课堂练习
  */
object Exercise01 {
  def main(args: Array[String]) {
    val names =List("Alice","Bob","Jack")
    val names2 = names.map(upper)
    println("names2 = "+names2)
  }

  def upper(s:String):String={
    s.toUpperCase()
  }

}
