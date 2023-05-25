package com.lab.chapter08

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.3
  * 伴生对象 apply方法
  */
object ApplyDemo01 {
  def main(args: Array[String]) {
    val list = List(1,2,5)
    println(list)
    val pig = new Pig("Tim")
    //使用apply方法来创建对象
    val pig2 = Pig("小黑猪") //自动 apply(pName:String)
    val pig3 = Pig()     //自动触发apply()
    println("pig2.name = "+ pig2.name)
    println("pig3.name = "+ pig3.name)

  }

}

class Pig(pName:String){
  var name:String = pName
}

object Pig{

  def apply(pName:String):Pig = new Pig(pName)

  def apply():Pig = new Pig("XH")

}