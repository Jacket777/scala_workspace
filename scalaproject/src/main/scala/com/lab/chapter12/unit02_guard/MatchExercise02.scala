package com.lab.chapter12.unit02_guard

/**
  * Created by 17081290 on 2020/7/8.
  */
object MatchExercise02 {
  def main(args: Array[String]) {

    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case _  => digit = 3
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明..
      }
      println("ch ="+ch + " sign ="+ sign + " digit=" + digit)
    }

    println("==========================================")
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case _ if ch >1000=> digit = 3
        case '+' => sign = 1
        case '-' => sign = -1
        case _ =>println("没有任何匹配---")

      }
      println("ch ="+ch + " sign ="+ sign + " digit=" + digit)
    }


  }





}
