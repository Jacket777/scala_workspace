package com.lab.chapter13.unit04_highfuction

/**
  * Created by 17081290 on 2020/7/2.
  * 清单13.4.2
  * 高阶函数--函数作为返回值
  *
  */
object HighFunctionDemo02 {
  def main(args: Array[String]) {
    /**
      * 说明：
      * 1.minusxy是高阶函数，因为它返回的是匿名函数
      * 2.返回的匿名函数为 (y:Int)=>x-y
      * 3.返回的匿名函数可以使用变量接受
      */
    def minusxy(x:Int)={
      (y:Int)=>x-y  //匿名函数
    }

    //分布执行
    //f1 就是 (y:Int)=>x-y
    val f1 = minusxy(3)
    println("f1 type = "+f1)
    println("f1(1) ="+f1(1))
    println("f1(9) = "+f1(9))

    //一步到位
    println("minusxy = "+minusxy(4)(9))

  }

}
