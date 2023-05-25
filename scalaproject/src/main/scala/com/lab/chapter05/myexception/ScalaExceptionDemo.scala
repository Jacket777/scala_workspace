package com.lab.chapter05.myexception

/**
  * Created by 17081290 on 2020/6/1.
  * 清单：5.6.2
  * Scala异常演示
  */
object ScalaExceptionDemo {
  def main(args: Array[String]) {
    try{
      val r  = 10/0
    }catch{
      /**
        * 说明：
        * 1.在scala中只有一个catch
        * 2.在catch中有多个case，每个case可以匹配一种异常，
        * 3.=> 关键符号，表示后面对异常的处理代码块
        * 4.finally最终要执行的
        */
      case ex:ArithmeticException =>{
        println("捕获了除数为0的算数异常")
      }

      case ex:Exception => println("捕获了异常")
    }finally{
      println("scala finally")
    }

    println("ok,------------")


  }

}
