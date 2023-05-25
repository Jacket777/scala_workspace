package com.lab.chapter13.unit04_highfuction

/**
  * Created by 17081290 on 2020/7/2.
  * 清单 13.4.1.
  * 高阶函数基本使用
  */
object HighFunctionDemo01 {
  def main(args: Array[String]) {
    def test(f:Double=>Double,f2:Double=>Int,n1:Double) ={
      f(f2(n1))
    }
    def sum(d:Double):Double={
      val res = d + d
      println(" sum res = "+res)
      res
    }

    def mod(d:Double):Int={
      val res = d.toInt %2
      println(" mod res ="+res)
      res
    }


  val res = test(sum,mod,5.0)
  println(" res ="+res)

  }




}
