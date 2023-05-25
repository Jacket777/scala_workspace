package com.lab.chapter10.unit01_array

/**
  * Created by 17081290 on 2020/6/10.
  * 清单 9.10
  * trait实现的参数多态
  */
object TraitMult {
  def main(args: Array[String]) {
    /**
      * 说明
      * 当一个类继承了一个trait
      * 那么该类的实例，就可以传递给这个trait引用
      */
    val a01 = new A
    B.test(a01)
  }
}


trait MyTrait01{

}

class A extends MyTrait01{

}

object B{
  def test(m:MyTrait01): Unit ={
    println("b ok....")
  }
}