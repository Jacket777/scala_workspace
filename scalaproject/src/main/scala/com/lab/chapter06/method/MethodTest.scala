package com.lab.chapter06.method

/**
  * Created by 17081290 on 2020/6/4.
  * 方法的课堂练习
  */
object MethodTest {
  def main(args: Array[String]) {
    val a = new MethodExec()
    a.printRect()

    //val area = a.area






  }
}

/*
编写类(MethodExec)，编程一个方法，方法不需要参数，在方法中打印一个10*8 的矩形，
在main方法中调用该方法。
 */
class MethodExec{


  def printRect(): Unit ={
    for(i<- 1 to 10){
      for(j<-1 to 8){
        print("*")
      }
      println()
    }
  }




}
