package com.lab.chapter12.unit07_matchTuple

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchTuple {
  def main(args: Array[String]) {
    val arr01 = Array((0, 1), (1, 0), (1, 1),(1,0,2))
    for (pair <- arr01) {
      val result = pair match { //
        case (0, _) => "0 ..." //
        case (y, 0) => y //
        case (x,y,z) => z
        case _ => "other" //.
      }
      println(result)
    }

  }

}
