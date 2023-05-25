package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * scala覆写字段
  */
object ScalaFieldOverrideDetail02 {
  def main(args: Array[String]) {
    val b1 = new B3
    println(b1.sal)
    val b2:A3 = new B3
    println("b2.sal = "+b2.sal)
  }

}


class A3{
   def sal(): Int ={
     return 10
   }
}

class B3 extends A3{
  override val sal:Int = 0
}
