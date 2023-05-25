package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.9
  * 函数练习题
  */
object Hello01 {
  def main(args: Array[String]) {
    /**
      * 等价于
      * def f1()={
      * "abc"
      * }
      * @return
      */
    def f1 = "abc"
    println(f1)
  }

}
