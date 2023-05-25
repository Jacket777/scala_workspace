package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.7
  * 动态混入特质--特质中只有抽象方法和具体方法
  */
object MixInDemo02 {
  def main(args: Array[String]) {
    //在不修改类的定义基础，让他们可以使用trait方法
    val oracleDB = new OracleDBA with Operate3A {
      override def show(): Unit = {
        println("oracle db ")
      }
    }  //ocp原则
    oracleDB.insert(100)
    oracleDB.show()
    println("===========================")

    val mySQL = new MySQL3A with Operate3A{
      override def show(): Unit = {
        println("mysql db ")
      }
    }
    mySQL.insert(200)
    mySQL.show()
    println("===========================")

    //如果有一个抽象类有抽象方法，如何动态混入特质
    val mySQL4 = new MySQL4 with Operate3A{
      override def say(): Unit = {
        println("say")
      }

      override def show(): Unit ={
        println("mysql 4 db")
      }
    }
    println("===========================")
    mySQL4.insert(999)
    mySQL4.say()
    mySQL4.show()

   //如果以个抽象类中有抽象方法和具体方法是，如何动态混入特质
   val db2 = new DB2 with Operate3A{
     override def say(): Unit = {
       println("say hi hi hi hi")
     }

     override def show(): Unit = {
       println("db2 db")
     }
   }
    println("===========================")
    db2.insert(250)
    db2.cry()
    db2.say()
    db2.show()

  }

}


trait Operate3A{
  def insert(id:Int): Unit ={
    println("插入数据 = "+id)
  }

  def show()
}

class OracleDBA{
}

abstract class MySQL3A{}

abstract class MySQL4A{
  def say()
}


abstract class DB2A{
  def say()
  def cry(): Unit ={
    println("hello hell0000")
  }
}