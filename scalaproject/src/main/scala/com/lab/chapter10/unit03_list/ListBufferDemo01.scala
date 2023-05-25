package com.lab.chapter10.unit03_list

import scala.collection.mutable.ListBuffer

/**
  * Created by 17081290 on 2020/6/10.
  */
object ListBufferDemo01 {
  def main(args: Array[String]) {
    //1.创建，并赋值
    val list0 = ListBuffer[Int](1,2,3)
    //2.访问
    println(" list0(2) = "+ list0(2))
    //3.遍历
    for(item <- list0){
      println(" item = "+item)
    }

    //4.创建 为空的list
    val list1 = new ListBuffer[Int]
    list1 += 4
    list1.append(5)
    println("list1 = "+list1) //list1 = ListBuffer(4, 5)

    list0++=list1             //一定要用++
    println("list0 = "+list0)  //list0 = ListBuffer(1, 2, 3, 4, 5)


    val list2 = list0 ++ list1
    println(" list2 = "+list2)  //list2 = ListBuffer(1, 2, 3, 4, 5, 4, 5)

    val list3 = list0 :+ 5
    println(" list3 = "+ list3)  // list3 = ListBuffer(1, 2, 3, 4, 5, 5)


    println("====删除====")
    println(" list1 = "+list1)   //list1 = ListBuffer(4, 5)
    list1.remove(1)
    for(item <- list1){
      println(" item = "+item)
    }
  }

}
