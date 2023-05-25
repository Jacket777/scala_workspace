package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单9.4
  * 隐式值
  */
object ImplicitValDemo03 {
  def main(args: Array[String]) {
    implicit val str1:String = "jack---"  //这个就是隐式值
    //implicit name:String //:name就是隐式参数

    def hello(implicit name:String): Unit ={
      println(name+" ")
    }

    hello //底层hello$1(str1)
  }

  /**
    * public void main(String[] args)
  {
    String str1 = "jack---";

    hello$1(str1);
  }
    */

}
