package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/8.
  * 面向对象编程--继承
  * 说明:
  * 1.在scala中，子类继承父类的所有属性
  * 2.但是private的属性和方法无法访问
  */
object Extends02 {
  def main(args: Array[String]) {
    val sub = new Sub
    sub.sayOK()
    //sub.test200() //编译器在语法中设置不能通过
  }

}


class Base{
  var n1:Int =1
  protected var n2:Int = 2
  private var n3:Int = 3

  def test100(): Unit ={
    println("BASE 100")
  }

  protected def test200(): Unit ={
    println("base 200")
  }

  private def test300(): Unit ={
    println("base 300")
  }

}


class Sub extends Base{
  def sayOK(): Unit ={
    this.n1 = 20
    this.n2 = 40

    println("范围 "+this.n1+" "+this.n2)
    test100()
    test200()

  }

}