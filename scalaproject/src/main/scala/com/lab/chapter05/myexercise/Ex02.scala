package com.lab.chapter05.myexercise

import scala.io.StdIn

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.7.2
  * 打印金子塔
  *
  */
object Ex02 {
  def main(args: Array[String]) {
    println("请输入1-9的数")

    val n = StdIn.readInt()
     print99(9)
  }


  def print99(n:Int)={
    for(i<-1 to n){
      for(j<-1 to i){
        printf("%d * %d = %d\t",j,i,j*i)
      }
      println()
    }


  }

}
