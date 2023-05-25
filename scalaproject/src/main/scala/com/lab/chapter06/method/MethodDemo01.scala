package com.lab.chapter06.method

/**
  * Created by 17081290 on 2020/6/2.
  * 请单6.2.1
  * 方法使用
  */
object MethodDemo01 {
  def main(args: Array[String]) {
     val dog = new Dog
     println(dog.cal(10,20))

  }

}

class Dog{
  var sal:Double=_
  var food:String = _ //如果使用这个方法，必须指定类型

  def cal(n1:Int,n2:Int):Int={
    return n1 + n2
  }
}