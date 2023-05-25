package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 9.6
  * 隐式类
  */
object ImplicitClassDemo {
  def main(args: Array[String]) {

    implicit class DB1(val m:MySQL1){
      def addSuffix(): String ={
        m +" scala"
      }
    }

    val mySQL = new MySQL1
    mySQL.sayOk()
    mySQL.addSuffix()  //研究 如何关联到DB1$1(mySQL).addSuffix();

  }

}

class DB1{}

class MySQL1{
  def sayOk(): Unit ={
    println("sayOK")
  }
}
