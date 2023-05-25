package com.lab.chapter04.myfor

/**
  * 清单 4.6.1. 循环方式
  */
object ForTo {
  def main(args: Array[String]) {
    val start = 1
    val end = 10  //循环结束的值
    for(i<- start to end){
      println("hello "+i)
    }

    //for这种推导，可以直接对集合进行遍历
    val list = List("hello",20,30,"tom")
    for(item <- list){
      println("item="+item)
    }

  }

}
