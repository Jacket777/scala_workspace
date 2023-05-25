package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.9
  * 富接口:特质中既有抽象方法又有非抽象方法
  */
trait Operate {
  def insert(id:Int)
  def pageQurey(pageno:Int,pageSize:Int):Unit={
    println("分页查询")
  }

}
