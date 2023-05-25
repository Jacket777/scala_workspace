package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 9.5
  * 传值 隐式值，默认值
  */
object ImplicitVal02 {
  def main(args: Array[String]) {
    //隐式变量[值]
    //implicit val name:String = "scala"
    //implicit val name1:String = "world"

    //隐式参数
    def hello(implicit content:String="jack"): Unit ={
      println("hello "+content)
    }

   hello

    //当同时有implicit 值和默认值，implicit优先级高
    def hello2(implicit content:String="jack"): Unit ={
      println("hello2 "+content)
    }

    hello2


    /**
      * 说明:
      * 1.当一个隐式参数匹配不到隐式值，仍然会使用默认值
      */
    implicit val name:Int = 10
    def hello3(implicit content:String="jack"): Unit ={
      println("hello3 "+content)
    }
    hello3

    //当没有隐式值，没有默认值，又没有传值，就会报错
    def hello4(implicit content:String="jack"): Unit ={
      println("hello3 "+content)
    }

    hello4


  }

}
