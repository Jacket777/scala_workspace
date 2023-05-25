package com.lab.chapter02.unit01_vars

/**
  * Created by 17081290 on 2020/5/14.
  * 清单 2.1 变量的使用
  *
  */
object VarDemo01 {
  def main(args: Array[String]) {
    var a : Int = 1 //定义一个整型变量,取名a,并赋初值1
    a = 2
    var b : Int = 3 //定义一个整型变量,取名b,并赋初值3
    b = 89 //给变量b 赋 89
    println("a=" + a) //输出语句,把变量a的值输出
    println("b=" + b) //把变量b的值输出



    val age: Int = 10
    val sal: Double = 10.9
    val name: String = "Tom"
    //在scala中，小数默认为Double，整数默认为Int
    val isPass: Boolean = true
    val score: Float = 70.9f
    println("sal = "+sal+" name = "+name+" score = "+score)

    printf(s"age = ${age}, isPass = ${isPass}")

  }

}
