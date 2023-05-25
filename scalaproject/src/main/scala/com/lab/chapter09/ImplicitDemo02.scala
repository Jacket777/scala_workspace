package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 9.2
  * 隐式转换丰富类库的功能
  */
object ImplicitDemo02 {
  //编写一个隐式函数，丰富mySQL功能
  implicit def addDelete(mysql:MySQL): DB ={
    new DB
  }

  def main(args: Array[String]) {
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() //编译器工作 分析addDelete$1(mySQL).delete()
    mySQL.update()

  }

}


class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}


class DB{
  def delete(): Unit ={
    println("delete")
  }

  def update(): Unit ={
    println("update")
  }
}
