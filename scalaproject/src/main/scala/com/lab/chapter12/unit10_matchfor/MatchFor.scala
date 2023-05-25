package com.lab.chapter12.unit10_matchfor

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchFor {
  def main(args: Array[String]) {
    val map = Map("A"->1, "B"->0, "C"->3)
    for ( (k, v) <- map ) {
      println(k + " -> " + v)
    }
    //说明
    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }
    //说明
    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }
  }

}
