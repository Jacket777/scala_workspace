package com.lab.chapter06.oop

/**
  * Created by 17081290 on 2020/6/2.
  * 请单6.1.3
  * 类和对象的内存分配机制
  */
object MemState {
  def main(args: Array[String]) {
    val p1 = new Person2
    p1.name = "jack"
    p1.age =10
    val p2 = p1
    println(p2==p1)
    p1.name = "tom"
    println("p2.name="+p2.name)

  }

}

class Person2{
  var name=""
  var age:Int = _ //如果使用下划线指定默认值，必须指定类型
}