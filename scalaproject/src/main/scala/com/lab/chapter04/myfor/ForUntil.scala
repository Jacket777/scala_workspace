package com.lab.chapter04.myfor

/**
  * 清单 4.6.2. 循环方式-until
  */
object ForUntil {
  def main(args: Array[String]) {
    val start = 1
    val end = 11
    for(i<- start until end){
      println("hello "+i)
    }

  }

}
