package com.lab.chapter03.arith

/**
  * 清单3.1.运算符操作
  */
object Demo01 {
  def main(args: Array[String]) {
    //1.除法的应用 /
    val r1 :Int  =10 / 3
    println("r1=" + r1)
    val r2 :Double =  10 / 3
    println("r2=" + r2)
    val r3 :Double = 10.0 / 3
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f"))


    //2.取模运算
    println( 10 % 3)
    println( -10 % 3)
    println( -10 % -3)
    println( 10 % -3)


    //3.无++,--
    var num1 = 10
    //num1++
    num1 += 1
    //num1--
    num1 -= 1
    println(num1)

    //算术运算符
    val a = 9
    val b = 8
    println(a > b)
    println(a >= b)
    println(a <= b)
    println(a < b)
    println(a == b)
    println(a != b)
    val flag:Boolean = a>b
    println(flag)


    //逻辑运算符
    val a1 = true
    val b1 = false
    println("a1&&b1 =" +(a1&&b1))
    println("a1||b1 ="+(a1||b1))
    println("!(a1&&b1) = "+(!(a1&&b1)))





  }

}
