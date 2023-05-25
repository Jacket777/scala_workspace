package com.lab.chapter06.method

/**
  * Created by 17081290 on 2020/6/2.
  * 请单6.2.2
  * 方法使用
  */
object MethodDemo02 {
  def main(args: Array[String]) {
      val m = new MethodExec
      m.printRect()
      m.width = 2.1
      m.len = 3.4
      println("area = "+m.area())


  }

}

class MethodExec{
  var len = 0.0
  var width  = 0.0

  def printRect(): Unit ={
    for(i<-0 until 10){
      for(j<- 0 until 8){
        print("*")
      }
      println()
    }
  }

  def area():Double={
    (this.len*this.width).formatted("%.2f").toDouble
  }
}