package com.lab.chapter02.unit03_dataconvert

/**
  * 2.11.值与String 转换
  */
object Demo03 {
  def main(args: Array[String]) {
    //有下划线，表示有类型转换 将基本类型转为String
    val str1 = true+""
    val str2 = 4.5+""
    val str3 = 100+""
    println("str1 = "+str1+" str2 = "+str2+" str3 ="+str3)
    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toLong

    println("num1="+num1)
    println("num2="+num2)
    println("num3="+num3)
    println("num4="+num4)

    val s3 = "hello"
    //必须确保转换的时候，能转换为有效数据，否则报错
    //println(s3.toInt)// 报错 NumberFormatException

    val s4 = "12.5"
   // println(s4.toInt) 报错 NumberFormatException
    //在scala中 转换的时候，不会对小数点后的数据进行截取，而是会抛异常
    println(s4.toDouble)
    println(s4.toDouble.toInt)
  }
}
