package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * scala中超类的构造
  */
object ScalaBaseConstractor {
  def main(args: Array[String]) {
      val emp3 = new Emp700("smith")
  }

}


class Person700(pName:String){
  var name = pName
  println("Person....")

  def this(){
    this("默认的名字")
    println("默认的名字")
  }
}


class Emp700 extends Person700{
  println("Emp....")
  //辅助构造器
  def this(name:String){
    this //必须调用主构造器
    this.name = name
    println("Emp 辅助构造器")
  }
}
