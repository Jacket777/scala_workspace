package com.lab.chapter11.unit01_mapop

/**
  * Created by 17081290 on 2020/6/26.
  * 清单11.1.3
  */
object HighOrderFunDemo02 {
  def main(args: Array[String]) {
    test2(sayOK)
    //test2(sub()) 报错

  }

  /**
    * 说明：
    * test2是一个高阶函数，可以接受一个没有输入，返回为unti的函数
    * @param f
    */
  def test2(f: () => Unit) = {
    f()}

  def sayOK() = {
    println("sayOKKK...")}

  def sub(n1:Int): Unit ={

  }
}