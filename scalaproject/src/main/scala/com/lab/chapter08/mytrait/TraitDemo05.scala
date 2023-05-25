package com.lab.chapter08.mytrait

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.6.
  * 特质中包含具体方法
  */
object TraitDemo05 {
  def main(args: Array[String]) {
    val t:MySQL3 = new MySQL3
    t.insert(10)
  }
}


trait Operate {
  def insert( id : Int ): Unit = {
    println("保存数据="+id)
  }
}


trait DB extends Operate {
  override  def insert( id : Int ): Unit = {
    println("向数据库中")
    super.insert(id)
  }
}




class MySQL3 extends DB{
}
