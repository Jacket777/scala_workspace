package com.lab.chapter08.mytrait

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.5.
  * 特质的作用
  */
object TraitDemo02 {
  def main(args: Array[String]) {
    val c = new C
    val f = new F
    c.getConnect()
    f.getConnect()

  }
}

trait Trait01{
  //定义一个规范
  def getConnect()
}


//先将6个类的关系写出
class A{

}

class B extends  A{

}


class C extends A with Trait01{
  override  def getConnect(): Unit ={
    println("连接mysql数据库.....")
  }
}

class D{}

class E extends D{}

class F extends D with Trait01{
  override  def getConnect(): Unit ={
    println("连接 oracle 数据库.....")
  }
}