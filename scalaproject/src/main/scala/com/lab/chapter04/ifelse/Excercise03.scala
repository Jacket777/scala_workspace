package com.lab.chapter04.ifelse

/**
  * Created by 17081290 on 2020/5/22.
  * 清单 3.7.-P98
  * 注意事项演示
  * if else是有返回值的，任何表达式都有返回值
  */
import scala.io.StdIn

object Excercise03 {
  def main(args: Array[String]) {
    val sumVal = 21
    val result =
      if(sumVal > 20){
        "结果大于20"
      }
    println("res=: "+result)  //返回结果是(),就是Unit



  }

}
