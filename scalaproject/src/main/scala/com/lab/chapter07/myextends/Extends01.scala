package com.lab.chapter07.myextends



/**
  * Created by 17081290 on 2020/6/8.
  * 面向对象编程--继承
  */
object Extends01 {
  def main(args: Array[String]) {
    val student = new Student
    student.name = "Jack" //调用了student.name 调用到从Person继承的name
    student.studying()
    student.showInfo()

  }

}

class Person{
  var name:String = _;
  var age:Int = _;

  def showInfo():Unit={
    println("学生信息如下: ")
    println("名字: "+this.name)

  }
}

class Student extends Person{
  def studying():Unit={
    //这里可以使用父类的属性
    println(this.name + " 学习 scala中....")
  }
}