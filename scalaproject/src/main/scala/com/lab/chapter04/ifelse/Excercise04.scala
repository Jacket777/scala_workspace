package com.lab.chapter04.ifelse

/**
  * Created by 17081290 on 2020/5/22.
  * 清单 4.3.-P99
  */
import scala.io.StdIn

object Excercise04 {
  def main(args: Array[String]) {
    println("请输入运动员的成绩: ")
    val speed = StdIn.readDouble()
    if(speed <= 8){
      println("请输入性别: ")
      val gender = StdIn.readChar()
      if(gender == '男'){
        println("请进入男子组 ")
      }else{
        println("请进入女子组 ")
      }

    }else{
      println("请出局 ")
    }


  }

}
