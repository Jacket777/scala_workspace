package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/8.
  * 面向对象编程--类型检查和转换
  * 1.classOf[String] 就如同Java的String.class
  * 2.obj.isInstanceOf[T] 就如同obj instanceof T 判断obj 是不是T类型
  * 3.obj.asInstanceOf[T] 就如同Java的(T)obj 强制转成T类型
  *
  */
object TypeConvert {
  def main(args: Array[String]) {
    println(classOf[String]) //输出  ClassOf的使用，可以得到类名
    val s = "king"
    println(s.getClass.getName)  //使用反射机制

    var p1 = new Person200
    var emp = new Emp200
    p1 = emp  //将子类的引用给父类（向上转型，自动）
    //将父类的引用重新转成子类引用（多态） 向下转型
    var emp2 = p1.asInstanceOf[Emp200]
    emp2.sayHello()



  }

}


class Person200{
  var name:String = "tom"

  def printName(): Unit ={
    println("Person printName() "+ name)
  }

  def sayHi(): Unit ={
    println("say Hi....")
  }
}


class Emp200 extends Person200{
  // 显示的使用override
  override def printName(): Unit ={
    println("Emp printName() "+name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()

  }


  def sayHello(): Unit ={
    println("say Hi...I am emp200")
  }
}