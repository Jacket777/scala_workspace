package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * * 清单 5.3.4
  * 函数注意事项和细节讨论
  *（8).Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，
  * 即：函数中可以再声明/定义函数，类中可以再声明类 ，
  * 方法中可以再声明/定义方法
  */
object Details03 {
  def main(args: Array[String]) {
    /**
      * 函数中定义函数
      */
    def f1():Unit={
      println("f1")
    }

    println("ok")


   def sayOk(): Unit ={//private final sayOK$1
     println("main sayok")
     def sayOK(): Unit ={  //private final sayOK$2
       println("sayok sayok")
     }

   }
  }
  def sayOk():Unit={//成员
    println("main sayok")
  }
}
