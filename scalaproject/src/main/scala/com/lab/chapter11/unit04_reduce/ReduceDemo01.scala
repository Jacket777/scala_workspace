package com.lab.chapter11.unit04_reduce

/**
  * Created by 17081290 on 2020/6/26.
  * 清单11.4.1
  * val list = List(1, 20, 30, 4 ,5) , 求出list的和.
    化简：将二元函数引用于集合中的函数,。
    上面的问题当然可以使用遍历list方法来解决，这里我们使用scala的化简方式来完成。

  */
object ReduceDemo01 {
  def main(args: Array[String]) {
    /**
      * 使用化简的方式计算list集合的和
      */
    val list = List(1, 20, 30, 4, 5)
    val res = list.reduceLeft(sum)//接受一个函数时，可以直接传入一个匿名函数

    /**
      * 执行流程分析
      * A.（1+20）结果作为第二次调用sum的参数
      * B.（1+20）+30
      * C.(（1+20）+30)+4
      * D.(（1+20）+30)+4)+5
      */
    println("res=" + res)


  }
  def sum(n1: Int, n2: Int): Int = {
    println("sum 被调用===")
    println("n1 ="+n1)
    n1 + n2
  }

}
