package com.lab.chapter10.unit03_list

/**
  * Created by 17081290 on 2020/6/10.
  * 清单 10.8
  * List 的创建
  * 1.List 默认为不可变的集合
  * 2.List 在scala包对象声明的，不用引入其他包可以使用
  * 3.List中可以放任何数据类型
  * 4.空列表为Nil对象
  *
  */
object ListDemo01 {
  def main(args: Array[String]) {
    val list01 = List(1,2,3)
    println(list01)
    val list02 = Nil
    println(list02)


    val value1 = list01(1)
    println("value1 = "+value1)
    println("--------list追加元素后的效果------")

    var list1 = List(1,2,3,"abc")
    val list2 = list1 :+ 4
    println(list1)
    println(list2)

    val list3 = 10 +: list1
    println("list3 = "+ list3)


    /**
      * 在列表的最后增加数据
      * 说明
      * 1.符号::表示向集合中新建集合添加元素
      * 2.运算是，集合对象一定要放置在最右边
      * 3.运算规则，从右向左
      * 4.:::运算符是将集合中每一个元素加入到集合中
      */


    /**
      * 说明 val list5 = 4::5::6::list4::Nil
      * 1. List()
      * 2. List(List(1,2,3,"abc"))
      * 3. List(6,List(1,2,3,"abc"))
      * 4. List(5,6,List(1,2,3,"abc"))
      * 5. List(4,5,6,List(1,2,3,"abc"))
      */
    val list4 = List(1,2,3,"abc")
    val list5 = 4::5::6::list4::Nil
    println(" list5 = "+list5)


    /**
      * 说明 val list6 = 4::5::6::list4:::Nil
      * 1. List()
      * 2. List(1,2,3,"abc")
      * 3. List(6,1,2,3,"abc")
      * 4. List(5,6,1,2,3,"abc")
      * 5. List(4,5,6,1,2,3,"abc")
      */

    val list6 = 4::5::6::list4:::Nil
    println(" list6 = "+list6)



  }

}
