package com.lab.chapter11.unit04_reduce

/**
  * Created by 17081290 on 2020/6/26.
  */
object ReduceExcercise01 {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4 ,5)

    println(list.reduceLeft(minus)) // 输出 -13 ((((1-2)-3)-4)-5)
    println(list.reduceRight(minus)) //输出 3 (1-(2-(3-(4-5))
    println(list.reduce(minus)) //是哪个，看源码秒懂  等价于reduceLeft

    println("min value = "+ list.reduceLeft(min))

  }

  def minus( num1 : Int, num2 : Int ): Int = {
    num1 - num2
  }

 //求出最小值
  def min(n1:Int,n2:Int):Int={
   if(n1 > n2) n2 else n1
 }
}
