package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  */
object ScalaBaseConstrator {
  def main(args: Array[String]) {
    val emp2 = new Emp800("mary")
    val emp3 = new Emp800("smith")
    val emp4 = new Emp800("terry",10)
    emp4.showInfo()

  }

}


class Person800(pName:String){
  var name = pName
  println("Person....")

  def this(){
    this("默认的名字")
    println("默认的名字")
  }
}

class Emp800 (eName:String,eAge:Int)extends Person700(eName){
  println("Emp....")
  //辅助构造器
  def this(name:String){
    this(name,100) //必须调用主构造器
    this.name = name
    println("Emp 辅助构造器")
  }


  def showInfo(): Unit ={
    println("雇员的名字",name)
  }
}