package com.lab.chapter10.unit01_array

/**
  * Created by 17081290 on 2020/6/9.
  * 清单9.2
  * 数组--定长数组
  */
object ArrayDemo01 {
  def main(args: Array[String]) {

    /**
      * 说明：
      * 1.创建一个Array对象，[Int]表示泛型，即该数组中，只能存放Int
      * 2.[Any] 表示该数组可以存放任意类型
      * 3.在没有赋值情况下，各个元素的值为0
      * 4.arr01(3) = 10表示修改第4个元素的值
      */
    val arr01 = new Array[Int](4) //底层int[]arr01 = new int[4]
    println(arr01.length)
    println("arr01(0) = "+ arr01(0))
    for(i<-arr01){
      println(i)
    }

    println("--------------------------")
    arr01(3) = 10
    for(i<-arr01){
      println(i)
    }


    println("===========第二种方式定义数组===============")
    /**
      * 说明
      * 1. 使用的是object Array 的apply
      * 2. 直接初始化数组，因为赋值为整数和字符串，所以这个数组的泛型就是Any
      * 3. 遍历方式一样
      */

    val arr02 = Array(1,3,"xx")
    arr02(1) = "xx"

    for(i<-arr02){
      println(i)
    }

    println("------------使用传统的方式遍历，使用下标的方式遍历--------------")
    for(index<- 0 until arr02.length){
      printf("arr01[%d] = %s",index, arr02(index)+"\t")

    }


  }

}
