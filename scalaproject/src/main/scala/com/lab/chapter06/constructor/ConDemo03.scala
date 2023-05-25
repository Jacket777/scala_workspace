package com.lab.chapter06.constructor



/**
  * Created by 17081290 on 2020/6/2.
  */
object ConDemo03 {
  def main(args: Array[String]) {
      val p1 = new Person2("Jack")
  }

}


//Person2有几个构造器
//1.1个主构造器，4个辅助构造器
class Person2 (){
  var name:String =""
  var age:Int=0


 def this(name:String){
    //辅助构造器无论是直接或者间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //而且需要放在辅助构造器的第一行【与java一样】

    this()//直接调用主构造器
    this.name = name
  }

  def this(name:String,age:Int){
    this()//直接调用主构造器
    this.name = name
    this.age =age
  }

  def this(age:Int){
    //间接调用主构造器，因为def this(name:String)中调用了主构造器
    this("AA")
    this.age = age
  }

  def showInfo(): Unit ={
    println("person information as below: ")
    println("name = "+this.name)
    println("age = "+this.age)
  }

}