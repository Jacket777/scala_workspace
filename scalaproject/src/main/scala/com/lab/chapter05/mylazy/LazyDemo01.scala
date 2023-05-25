package com.lab.chapter05.mylazy

/**
  * Created by 17081290 on 2020/6/1.
  * 清单：5.5.2
  * 惰性函数
  */
object LazyDemo01 {
  def main(args: Array[String]) {
    //val res = sum(10,20)
    lazy val res = sum(10,20)
    println("---------")
    println("res = "+res) //在要使用res前，才执行

  }


  def sum(n1:Int,n2:Int):Int={
    println("sum 执行了")
    return n1 + n2
  }

}
