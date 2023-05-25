package com.lab.chapter04.ifelse

/**
  * Created by 17081290 on 2020/5/22.
  * 清单：出票系统
  */
import scala.io.StdIn

object Excercise05 {
  def main(args: Array[String]) {
    println("输入月份: ")
    val month = StdIn.readInt()
    println("输入年龄: ")
    val age = StdIn.readInt()
    val ticket = 60
    if(month >=4 && month <=10){
      if(age >=18 && age <=60){
        println("你的票价: "+ticket)
      }else if(age < 18){
        println("你的票价: "+ticket/2)
      }else{
        println("你的票价: "+ticket/3)
      }
    }else{
      if(age >=18 && age <=60){
        println("你的票价: "+40)
      }else{
        println("你的票价: "+20)
      }
    }


  }

}
