package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.1
  * 函数注意事项和细节讨论
  * (1).函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()

  */
object Deatils {
  def main(args: Array[String]) {
   val res = test
   println("res = "+res)
  }

  def test():String={
    "hello"
  }

}
