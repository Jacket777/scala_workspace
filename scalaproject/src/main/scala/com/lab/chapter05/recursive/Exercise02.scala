package com.lab.chapter05.recursive

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.2.3
  *题2：求函数值
  * 已知 f(1)=3; f(n) = 2*f(n-1)+1;
  * 请使用递归的思想编程，求出 f(n)的值?


  */
object Exercise02 {
  def main(args: Array[String]) {
    val res01 = fn(5)
    println("res01 = "+res01)

  }

   def fn(n:Int):Int={
     if(n==1 ){
       3
     }else{
       1+2*fn(n-1)
     }
   }
}
