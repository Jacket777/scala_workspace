package com.lab.chapter05.myexception

/**
  * Created by 17081290 on 2020/6/1.
  * 清单：5.6.3
  * Scala异常演示--throw
  */
object ScalaExceptionDemo02 {
  def main(args: Array[String]) {
//    val res = test()
//    println(res.toString)
    try{
      test()
    }catch{
      case ex:Exception => {
        println("捕获的异常"+ ex.getMessage)
        println("捕获的异常AAA")
      }
      case ex:ArithmeticException => println("算术的异常"+ ex.getMessage)
    }finally{
      //一般做资源清理工作
      println("ok,------------")
    }


    //f11()
    println("ok,------------")

  }

  def test():Nothing={
    throw new ArithmeticException("算术异常")
  }


  @throws(classOf[NumberFormatException]) //等同于Java NumberFormatException.class
  def f11()={
    "abc".toInt
  }

}
