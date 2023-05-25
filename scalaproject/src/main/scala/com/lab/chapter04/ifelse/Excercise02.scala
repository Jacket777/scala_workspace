package com.lab.chapter04.ifelse

import scala.math._ //表示将scala.math的所有内容导入
/**
  * Created by 17081290 on 2020/5/22.
  * 清单 3.7.-P97
  * 多分支演示
  *
  */

object Excercise02 {
  def main(args: Array[String]) {
    val a = 3
    val b = 100
    val c =  6
    val m = b*b - 4*a*c
    var x1 = 0.0
    var x2 = 0.0
    if(m>0){
      x1 = (-b+sqrt(m))/2 * a
      x2 = (-b-sqrt(m))/2 * a
      println("方程有两个解 x1 = %f, x2 = %f",x1.formatted("%.2f"),x2.formatted("%.2f"))
    }else if(m ==0){
      x1 = (-b+sqrt(m))/2 * a
      println("方程有一个解 x1 = %.2f ",x1.formatted("%.2f"))
    }else{
      println("方程无解")
    }


  }

}
