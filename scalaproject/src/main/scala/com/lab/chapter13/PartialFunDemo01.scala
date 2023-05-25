package com.lab.chapter13

/**
  * Created by 17081290 on 2020/6/29.
  * 清单13.1.1
  * 问题：
  * 给你一个集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
   将集合list中的所有数字+1，并返回一个新的集合
   要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  */
object PartialFunDemo01 {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4, "abc")
    //
    /**
      * 思路1,使用map+fliter的思路
      * 虽然可以解决问题，但比较麻烦
      * @param n
      * @return
      */
    def f1(n:Any): Boolean = {
      n.isInstanceOf[Int]
    }
    def f2(n:Int): Int = {
      n + 1
    }
    def f3(n:Any): Int ={
      n.asInstanceOf[Int]
    }
    val list2 = list.filter(f1).map(f3).map(f2)
    println("list2=" + list2)

    /**
      * 使用默认匹配
      *
      */
    def addOne(i:Any):Any={
      i match{
        case x:Int =>x+1
        case _=>

      }
    }

    val list3 = list.map(addOne)
    println("list3 = "+list3)



  }

}
