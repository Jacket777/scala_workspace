package com.lab.chapter11.unit01_mapop

/**
  * Created by 17081290 on 2020/6/12.
  * 清单11.1.2
  */
object HighOrderFunDemo01 {
  def main(args: Array[String]) {



    val res = test(sum2 _,3.5)
    val res2 = test(sum2 _,3.5)
    println("res = "+res)

    /**
      * 在scala中，可以把一个函数直接付给一个变量
      * 但是不执行函数，则加下划线
      */
     val f1 = myPrint _
     f1() //执行
  }

  def myPrint(): Unit ={
    println("hello world")
  }

  /**
    * 说明：
    * 1.test是一个高阶函数
    * 2.f:Double=>Double表示一个函数，该函数可以接受一个Double类型的值，返回一个Double类型的值
    * 3.n1:Double 普通参数
    * 4.f(n1)在test函数中执行你传入的函数
    * @param f
    * @param n1
    */
  def test(f:Double=>Double,n1:Double) ={
    f(n1)
  }

  /**
    * 说明：普通函数
    * 该函数可以接受一个Double类型的值，返回一个Double类型的值
    * @return
    */
  def sum2(d:Double):Double={
    println(" sum2 be called")
    d*2
  }

}
