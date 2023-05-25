package com.lab.chapter07.visit

/**
  * Created by 17081290 on 2020/6/8.
  * scala包可见性演示
  * Java中，访问的权限分为:public， private，protected和默认
  * 在scala中，可以通过类似的修饰符达到同样的效果
  */
object TestVisit {
  def main(args: Array[String]) {
    val c = new Clerk
    c.showInfo()
    Clerk.test(c)

  }

}


class Clerk{
  var name:String = "jack"
  private var sal:Double = 9999.9
  def showInfo():Unit={
    println("name "+name+" sal = "+sal)
  }
}

object Clerk{
  def test(c:Clerk):Unit={
    //这里体现在伴生对象中，可以访问c.sal
    println(" test() name = "+c.name+" sal = "+c.sal)
  }
}
