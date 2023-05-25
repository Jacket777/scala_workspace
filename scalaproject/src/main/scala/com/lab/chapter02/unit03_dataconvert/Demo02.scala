package com.lab.chapter02.unit03_dataconvert

/**
  * 清单2.10-强制类型转换
  */
object Demo02 {
  def main(args: Array[String]) {
     val num1:Int = 10*3.5.toInt + 6*1.5.toInt
     val num2:Int = (10*3.5+6.15).toInt
     println(num1+" "+num2)

    var char1:Char = 1 //保留Int 常量值
    val num:Int = 3
    //var char2:Char = num //不保留Int 变量值
  }
}
