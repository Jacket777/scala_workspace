package com.lab.chapter12.unit02_guard

/**
  * Created by 17081290 on 2020/7/8.
  * 课堂练习
  */
object MatchExerices01 {
  def main(args: Array[String]) {
    println("==========================================")
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明 可以有多个默认匹配，但后面的默认匹配无效，编译器也不报错
        case _  => digit = 3
        case _  => sign = 2
      }
      println("ch ="+ch + " sign ="+ sign + " digit=" + digit)

    }
  }

}
