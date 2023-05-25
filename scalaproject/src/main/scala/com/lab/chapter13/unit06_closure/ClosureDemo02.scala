package com.lab.chapter13.unit06_closure

/**
  * Created by 17081290 on 2020/7/6.
  * 清单：13.6.2
  * 闭包的最佳实践
  */
object ClosureDemo02 {
  def main(args: Array[String]) {
    /**
      * 请编写一个程序，具体要求如下
     编写一个函数 makeSuffix(suffix: String)
     可以接收一个文件后缀名(比如.jpg)，并返回一个闭包
      调用闭包，可以传入一个文件名，如果该文件名没有指定的后缀(比如.jpg) ,则返回 文件名.jpg ,
    如果已经有.jpg后缀，则返回原文件名。要求使用闭包的方式完成
     String.endsWith(xx)
      */
    val f = makeSuffix(".jpg")
    println(f("dog.jpg"))
    println(f("cat"))

  }


  def makeSuffix(suffix:String)={
    (filename:String)=>{
      if(filename.endsWith(suffix)){
        filename
      }else{
        filename+suffix
      }
    }
  }

}
