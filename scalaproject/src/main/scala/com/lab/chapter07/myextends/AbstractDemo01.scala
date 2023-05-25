package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * 抽象类--演示
  * 细节说明：
  * 1.默认情况下，一个抽象类是不能实例化的，
  * 但是实例化时，动态的实现了抽象类的所有抽象方法，也可以
  * 2.抽象类不一定要包含abstract方法，也就是说抽象类可以没有abstract方法
  * 在抽象类中可以有实现的方法
  * 3.一旦类包含了抽象方法或者抽象属性，则这个类必须声明为abstract
  * 4.抽象方法不能有主体，不允许使用abstract修饰
  * 5.如果一个类继承了抽象类，则必须实现抽象类的所有抽象方法和抽象属性
  * 除非它自己也声明为abstract类
  * 6.抽象方法和抽象属性不能使用private,final来修饰，因为这些关键字都是和重写、实现违背的
  * 7.子类重写重写抽象方法不需要override，写上也不会错
  */
object AbstractDemo01 {
  def main(args: Array[String]) {
       println("xxxxx")
    //默认情况下，一个抽象类是不能实例化的，
    //但是实例化时，动态的实现了抽象类的所有抽象方法，也可以
    val animal = new Animal03 {//抽象方法不能有主体，不允许使用abstract修饰
    override def sayHello(): Unit = {
      println("say hello -----")
    }

      override var food: String = "Jack"
    }

    animal.sayHello()
  }

}


//抽象类
abstract class Animal{
  var name:String //抽象字段
  var age:Int //抽象的字段
  var color:String = "black" //普通属性
  def cry() //抽象方法，不需要标记
}


abstract class Animal02 {
  //在抽象类中可以有实现的方法
  def sayHi(): Unit ={
    println("xxxx")
  }
}


abstract class Animal03{
  //抽象方法不能有主体，不允许使用abstract修饰
  def sayHello()
  var food:String
}



//如果一个类继承了抽象类，则必须实现抽象类的所有抽象方法和抽象属性
//除非它自己也声明为abstract类
class Dog extends Animal03{
  override def sayHello(): Unit ={
    println("dog wo wo")
  }

  override var food:String = _
}