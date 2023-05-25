package com.lab.chapter12.unit11_matchcase

/**
  * Created by 17081290 on 2020/6/29.
  */
object CaseClassDemo03 {
  def main(args: Array[String]) {
    val amt = Currency3(29.95, "RMB")
    val amt1 = amt.copy() //创建了一个新的对象，但是属性值一样
    val amt2 = amt.copy(value = 19.95) //创建了一个新对象，但是修改了货币单位
    val amt3 = amt.copy(unit = "英镑")//..
    println(amt)
    println(amt2)
    println(amt3)

  }

}


abstract class Amount3
case class Dollar3(value: Double) extends Amount3
case class Currency3(value: Double, unit: String) extends Amount3
case object NoAmount3 extends Amount3