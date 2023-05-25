package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.7
  * 动态混入特质---特质中只有具体方法
  */
object MixInDemo01 {
  def main(args: Array[String]) {
    //在不修改类的定义基础，让他们可以使用trait方法
    val oracleDB = new OracleDB with Operate3  //ocp原则
    oracleDB.insert(100)

    val mySQL = new MySQL3 with Operate3
    mySQL.insert(200)

    //如果有一个抽象类有抽象方法，如何动态混入特质
    val mySQL4 = new MySQL4 with Operate3{
      override def say(): Unit = {
        println("say")
      }
    }
    mySQL4.insert(999)
    mySQL4.say()

   //如果以个抽象类中有抽象方法和具体方法是，如何动态混入特质
   val db2 = new DB2 with Operate3{
     override def say(): Unit = {
       println("say hi hi hi hi")
     }
   }

    db2.insert(250)
    db2.cry()
    db2.say()

  }

}


trait Operate3{
  def insert(id:Int): Unit ={
    println("插入数据 = "+id)
  }
}

class OracleDB{
}

abstract class MySQL3{}

abstract class MySQL4{
  def say()
}


abstract class DB2{
  def say()
  def cry(): Unit ={
    println("hello hell0000")
  }
}