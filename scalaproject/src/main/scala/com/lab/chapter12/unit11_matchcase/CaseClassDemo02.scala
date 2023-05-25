package com.lab.chapter12.unit11_matchcase

/**
  * Created by 17081290 on 2020/6/29.
  */
object CaseClassDemo02 {
  def main(args: Array[String]) {
    println("==============")
    for (amt <- Array(Dollar2(1000.0), Currency2(1000.0, "RMB"), NoAmount2)) {
      val result = amt match {
        //说明
        case Dollar2(v) => "$" + v
        //说明
        case Currency2(v, u) => v + " " + u
        case NoAmount2 => ""
      }
      println(amt + ": " + result)
    }

  }
}

abstract class Amount2
case class Dollar2(value: Double) extends Amount2
case class Currency2(value: Double, unit: String) extends Amount2
case object NoAmount2 extends Amount2