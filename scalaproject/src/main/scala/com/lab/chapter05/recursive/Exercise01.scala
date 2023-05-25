package com.lab.chapter05.recursive

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.2.2
  * 题1：斐波那契数 请使用递归的方式，
  * 求出斐波那契数1,1,2,3,5,8,13...
  * 给你一个整数n，求出它的斐波那契数是多少？

  */
object Exercise01 {
  def main(args: Array[String]) {
    val res01 = fabn(10)
    println("res01 = "+res01)

  }

   def fabn(n:Int):Int={
     if(n==1 ||n==2){
       1
     }else{
       fabn(n-1)+fabn(n-2)
     }
   }
}
