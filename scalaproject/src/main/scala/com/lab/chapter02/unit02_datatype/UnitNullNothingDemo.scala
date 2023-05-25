package com.lab.chapter02.unit02_datatype

/**
  * Created by 17081290 on 2020/5/18.
  * 清单2.8--特殊类型演示
  * Unit
  * Null
  * Nothing
  */
object UnitNullNothingDemo {
  def main(args: Array[String]) :Unit ={
    val res = sayHello()
    println("res="+res)
    //Null类只有一个实例对象，null，类似于Java中的null引用
    //给anyRef对象，但不能给anyVal对象赋值
    val dog:Dog = null
    //var char1:Char = null  //运行时报错
    println("ok-----")


  }

  //Unit等价于Java的void,只有一个实例值--小括号
  def sayHello():Unit={}


  //比如开发中,我们有一个方法， 就会异常中断，这时可以返回Nothing
  //也就是说当我们Nothing作为返回值，就是说明该方法没有正常的返回值
  def sayHello2:Nothing={
    throw new Exception("AAAAA")
  }


}

class Dog{
}