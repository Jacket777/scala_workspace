package com.lab.chapter10.unit06_set

import scala.collection.mutable

/**
  * Created by 17081290 on 2020/6/10.
  * 集是不重复元素的结合。集不保留顺序，默认是以哈希集实现
  */
object SetDemo01 {
  def main(args: Array[String]) {
    /**
      * part -1 set的创建
      */
    println("-----------1.set的创建--------------------")
    val set = Set(1,2,3) //不可变
    println(set)
    val set2 = mutable.Set(1,2,"hello") //可变
    println("set2 ="+set2)

    /**
      *part -2 set的添加 三种方式
      */
    //1.可变集合的添加  不会重复添加，也不会报错
    set2.add(4) //1.方法
    set2 += 6   //2.操作符
    set2.+=(5)  //3.
    println("after add set2 = "+set2)


    /**
      *part -3 set的删除 二种方式
      * 1.操作符形式
      * 2.方法形式，可以直接删除值
      * 3.删除对象不存，则不会生效，也不会报错
      */
    set2-=2 //1.操作符形式
    set2.remove("abc") //2.方法形式，可以直接删除值
    println("after remove set2 = "+set2)  //删除对象不存，则不会生效，也不会报错

    /**
      *part -4 集合的遍历
      */
    for(x <- set2 ){
      println(x)
    }
  }

}
