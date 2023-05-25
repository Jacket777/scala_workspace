package com.lab.chapter07.myextends

/**
  * Created by 17081290 on 2020/6/9.
  * scala 匿名子类使用
  */
object ScalaNoNamDemo02 {
  def main(args: Array[String]) {
    val monster = new Monster {override def cry(): Unit = {
      println("MONSTER CRY....")
    }

      override var name: String = "jack"
    }
    monster.cry()

  }

}

abstract class Monster{
  var name:String
  def cry()
}