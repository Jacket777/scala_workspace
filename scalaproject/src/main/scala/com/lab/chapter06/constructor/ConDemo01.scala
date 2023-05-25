package com.lab.chapter06.constructor

/**
  * Created by 17081290 on 2020/6/2.
  * 清单6.3.1
  * 构造器使用
  */
object ConDemo01 {
  def main(args: Array[String]) {
//    val p1 = new PersonA("jack",20)
//    println(p1)
//
//    val a = new A
//    val a2 = new A()
    val p2 = new Person("tom");
    println(p2.name+" "+p2.age)

  }

}


class Person(inName:String,inAge:Int){
  var name:String = inName
  var age:Int = inAge
  age +=10
  println("============")

  //重写toString,便于输出对象信息
  override def toString:String={
    "name="+this.name+"\t age"+this.age
  }

  println("ok=======")

  def this(name:String){
    //辅助构造器，必须在第一行显示调用主构造器（可以是直接也可以是间接）
    this("jack",10)
    this.name = name
  }
}

class A(){

}