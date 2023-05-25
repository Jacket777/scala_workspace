package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * scala覆写字段
  */
object ScalaFieldOverride {
  def main(args: Array[String]) {
    val a1:A2 = new B2
    val a2:B2 = new B2
    // a1.age=>a1.age()
    // a2.age => a2.age()
    println("a1.age = "+a1.age+"\t"+"a2.age = "+a2.age)

  }

}

//如果 val age改成var报错
class A2{
  val age:Int = 10
}

class B2 extends A2{
  override val age:Int = 20
}
