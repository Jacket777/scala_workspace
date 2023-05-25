package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * scala覆写字段--抽象字段重写
  * var 只能重写另一个抽象的var属性
  */
object ScalaFieldOverrideDetail03 {
  def main(args: Array[String]) {
    val b1 = new B3
    println(b1.sal)
    val b2:A3 = new B3
    println("b2.sal = "+b2.sal)
  }

}



/*


 */
/**
  * 在A03中，有一个抽象的字段（属性）
  * 1.抽象的字段（属性）：就是没有初始化的字段（属性）
  * 2.当一个类有抽象属性时，则该类需要标记为abstract
  * 3.对于抽象的属性，底层不会生成对应的属性声明，而是生成两个对应的抽象方法(name.name_$eq)
  *
  */
abstract class A03{
   var name:String  //抽象
   var age:Int = 10
}

class Sub_A03 extends A03{
  /**
    * 说明
    * 1.如果在子类中去重新父类的抽象属性，本职上实现了抽象方法
    * 2.这里override可以写，也可以不写
    */
  override var name:String = ""
}
