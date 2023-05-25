package com.lab.chapter02.unit03_dataconvert

/**
  * 清单2.9-类型转换
  */
object Demo01 {
  def main(args: Array[String]) {
    val n1 = 10
    val n2 = 1.1f
    //1.系统有多种类型，系统首先将数据转换成容量最大的类型，然后再进行计算
    val n3 = n1 + n2
    println(" n3 type is Float " +n3.isInstanceOf[Float]);



   //2.(byte,short)和char之间不会自动的转换类型
    val n4:Byte = 10
    //var char1:Char = n4  //错误，因为byte不能自动转换char
    val b :Byte = 10
    val c:Char  = 90
    val result = b + c
    println("result is "+result)
    println("result type is Int "+result.isInstanceOf[Int])
    //var s:Short = b + c  //b,c参与运算后，转为Int,Int 类型不能转换为Short
    //var s2:Short = 10 + 90 //Int 类型不能转换为Short
    var s3:Short = 100

  }

}
