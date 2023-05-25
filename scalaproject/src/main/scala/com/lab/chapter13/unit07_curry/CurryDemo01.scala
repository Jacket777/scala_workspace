package com.lab.chapter13.unit07_curry

/**
  * Created by 17081290 on 2020/7/6.
  * 清单13.7.1.curry快速入门
  * 编写一个函数，接收两个整数，可以返回两个数的乘积，要求:

  使用闭包的方式完成
  使用函数柯里化完成
  *
  */
object CurryDemo01 {
  def main(args: Array[String]) {
    /**
      * 1.使用常规的方式完成
      */
    def mul(x:Int,y:Int)=x*y
    println(mul(2,5))
    /**
      * 2.使用闭包的方式完成
      */

    def mulClose(x:Int)=(y:Int)=>x*y
    println(mulClose(2)(5))
    /**
      *3.使用函数柯里化完成
      */
    def mulcurry(x:Int)(y:Int)=x*y
    println(mulcurry(2)(5))

  }

}
