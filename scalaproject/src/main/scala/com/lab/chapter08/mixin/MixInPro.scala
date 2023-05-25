package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.10
  * 特质的具体字段
  * 特质中可以定义具体字段，如果初始化就是具体字段，如果没有初始化就是抽象字段
  * 混入该特质的类具有该字段，字段不是继承而是直接加入类称为自己的字段
  */
object MixInPro {
  def main(args: Array[String]) {
     val mysql = new MySQL6 with DB6 {
       override var sal= 23

     }

  }
}


trait DB6{
  var sal:Int //抽象字段
  var opertype:String = "insert"

  def insert(): Unit ={

  }
}

class MySQL6{

}
