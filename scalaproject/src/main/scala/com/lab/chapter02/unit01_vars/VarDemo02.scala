package com.lab.chapter02.unit01_vars

/**
  * Created by 17081290 on 2020/5/15.
  * 清单2.3 类型推导
  */
object VarDemo02 {
  def main(args: Array[String]) {
    var num = 10 //num 为Int
    //1.idea的提示来证明 变量类型
    num = 11
    println(num)
    //2.方法证明
    println(num.isInstanceOf[Int]);
    //类型确定后，就不能修改，说明scala是强数据类型语言
    //num = 1.1

    //var 与 val 区别 :var修饰的变量可变，val修饰的变量不可变
    var age = 20 // age 是可以改变的
    age = 30
    val num2 = 30
    println("num2 = "+num2)
    //num2 = 40 // val修饰的变量是不可以改变的

    //1.实际编程中，更多的需求是创建对象后，读取该对象的属性，或者修改对象的属性值
    //但很少去改变对象的本身，这时可以使用val
    //2.因为val,没有线程安全问题，因此效率高，scala设计者推荐使用val
    //3.如果对象需要变化，则使用var
    val dog = new Dog()
    //dog = new Dog() //报错 Ressignment to val
    dog.age = 90
    dog.name = "小花"
  }
}

class Dog {
  var age: Int = 0
  var name: String = ""
}
