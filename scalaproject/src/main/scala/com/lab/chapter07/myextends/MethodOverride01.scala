package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/8.
  * 面向对象--继承
  * 重写
  */
object MethodOverride01 {
  def main(args: Array[String]) {
    val emp = new Emp100
    emp.printName()

  }

}

class Person100{
  var name:String = "tom"

  def printName(): Unit ={
    println("Person printName() "+name)
  }

  def sayHi(): Unit ={
    println("say Hi.....")
  }
}



class Emp100 extends Person100{
  // 显示的使用override
  override def printName(): Unit ={
    println("Emp printName() "+name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()
    
  }
}
