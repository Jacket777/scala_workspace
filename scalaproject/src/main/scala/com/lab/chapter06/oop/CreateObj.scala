package com.lab.chapter06.oop

/**
  * Created by 17081290 on 2020/6/1.
  * 清单6.1.2
  * 创建对象
  */
object CreateObj {
  def main(args: Array[String]) {
    val emp = new Emp            //emp类型就是Emp
    val emp2:Person = new Emp    //子类对象交给父类的引用，则必须写上类型

  }

}

class Person{

}

class Emp extends Person{

}
