package com.lab.chapter03.inputcon

/**
  * Created by 17081290 on 2020/5/21.
  * 清单3.4 从控制台中输入数据--伴生对象
  */
import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]) {
    /*
    从控制台中接收用户信息
     */
    println("请输入用户姓名:  ")
    val name = StdIn.readLine()
    println("请输入年龄:  ")
    val age = StdIn.readInt()
    println("请输入薪水:  ")
    val sal = StdIn.readDouble()
    printf(s"用户的信息为 name=%s age=%d sal=%.2f",name,age,sal)

    Cat.sayHi()
    Cat.sayHi()

  }

}


//特质---等价于java中接口和抽象类
trait A{
  def sayHello():Unit={
    println("A say HELLO")
  }

}


//伴生对象
object Cat extends A{
  def sayHi(): Unit ={
    println("cat say hello")
  }
}

