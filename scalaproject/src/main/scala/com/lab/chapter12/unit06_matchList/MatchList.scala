package com.lab.chapter12.unit06_matchList

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchList {
  def main(args: Array[String]) {
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //
        case x :: y :: Nil => x + " " + y //
        case 0 :: tail => "0 ..." //
        case _ => "something else"
      }
      println(result)
    }

  }

}
