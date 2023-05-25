package com.lab.chapter11.unit02_flatmap

/**
  * Created by 17081290 on 2020/6/26.
  */
object FlatMapDemo01 {
  def main(args: Array[String]) {
    val names = List("Alice", "Bob", "Nick")
     //需求将list集合中所有元素进行扁平化操作，把所有元素打散
    val names2 = names.flatMap(upper)
    println("names2 = "+names2)
  }

  def upper( s : String ) : String = {
    s. toUpperCase
  }
}
