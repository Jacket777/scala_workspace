package com.lab.chapter13.unit02_functionparameter

/**
  * Created by 17081290 on 2020/7/2.
  * 清单 2.1.
  * 函数参数
  */
object FunParameter {
  def main(args: Array[String]) {
    def plus(x:Int) = 3+x
    val result1 = Array(1,2,3,4).map(plus(_))
    println(result1.mkString(","))

    /**
      * 函数也是有类型的，plus中只有一个参数，所有类型为function1
      */
    println("puls的函数类型 function1 "+(plus _))

  }

}
