package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单9.5
  * 隐式转换时 需要遵守两个基本前提
  * 1.不能存在二义性
  * 2.隐式操作不能嵌套使用
  */
object ImplicitNotic {
  def main(args: Array[String]) {
    implicit def f1(d:Double): Int ={
      d.toInt

    }
    val num1:Int = 1.1
  }
}
