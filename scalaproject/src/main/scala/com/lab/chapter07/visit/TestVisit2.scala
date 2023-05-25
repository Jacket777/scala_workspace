package com.lab.chapter07.visit

/**
  * Created by 17081290 on 2020/6/8.
  * scala包可见性演示
  * Java中，访问的权限分为:public， private，protected和默认
  * 在scala中，可以通过类似的修饰符达到同样的效果
  */
object TestVisit2 {
  def main(args: Array[String]) {
    val c = new Clerk2
    c.showInfo()
    Clerk2.test(c)

  }

}


class Clerk2{
  var name:String = "jack"
  private var sal:Double = 9999.9
  protected var age = 10
  var job:String = "大数据工程师"
  def showInfo():Unit={
    //在本类可以使用私有的
    println("name "+name+" sal = "+sal)
  }
}


//当一个文件中出现了class Clerk 和 object Clerk
//1. class Clerk 称为伴生类
//2. object Clerk 的伴生对象
//3. 因为scala设计者将static拿掉，他就设计了伴生类和伴生对象的概念
//4. 伴生类写非静态内容，伴生对象就是静态内容

object Clerk2{
  def test(c:Clerk2):Unit={
    //这里体现在伴生对象中，可以访问c.sal
    println(" test() name = "+c.name+" sal = "+c.sal)
  }
}


class Person{

  //增加一个包的访问权限
  //下面 private[visit]
  //1. 仍然是private
  //2.在visit包[包括子包]下也可以使用name,相当于扩大访问范围
  private [visit] val name = "Jack"

}