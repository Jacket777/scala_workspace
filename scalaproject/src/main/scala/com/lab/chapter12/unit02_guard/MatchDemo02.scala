package com.lab.chapter12.unit02_guard

/**
  * Created by 17081290 on 2020/6/28.
  */
object MatchDemo02 {
  def main(args: Array[String]) {
    for (ch <- "+-3!") {//遍历字符串
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明
        /**
          * 如果 case _ 有if语句，这时则不表示默认匹配
          * 表示忽越掉传入的ch,
          * 省掉
          */
        case _ if ch.toString.equals("3") => digit = 3
        case _ if ch >10 => println("ch > 10")
        case _ => sign = 2
      }
      println("ch ="+ch + " sign ="+ sign + " digit=" + digit)
    }
  }}

