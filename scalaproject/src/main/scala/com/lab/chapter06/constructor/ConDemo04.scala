package com.lab.chapter06.constructor

/**
  * Created by 17081290 on 2020/6/2.
  */
object ConDemo04 {
  def main(args: Array[String]) {
    val worker = new Worker("smith")

    println( worker.name) //不能访问inName
    val worker2 = new Worker2("smith2")
    worker2.name
    worker2.inName //能访问inName
    println( worker2.name)
    println(worker2.inName)
    val worker3 = new Worker3("smith3")
    worker3.name="mary" //可以写
    println(worker3.inName) //可以读

  }
}

//1.如果主构造器是Worker(inName:String)，那么inName就是一个局部变量
class Worker(inName:String){
  var name =inName
}

//2.如果主构造器是Worker2(val inName:String)，那么inName就是work2的一个private 只读属性
class Worker2(val inName:String){
  var name = inName

}

//3.如果主构造器是Worker3(var inName:String)，那么inName就是work3的一个private 读写属性
class Worker3(var inName:String){
  var name = inName

}