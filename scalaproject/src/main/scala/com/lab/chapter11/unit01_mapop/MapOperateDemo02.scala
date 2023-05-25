package com.lab.chapter11.unit01_mapop

/**
  * Created by 17081290 on 2020/6/26.
  * 清单11.1.4
  */
object MapOperateDemo02 {
  def main(args: Array[String]) {
    val list1 = List(3,5,7,9)  //集合
    /**
      * 说明
      * 1.list1.map(multiply)做了什么
      * A.将list的集合元素依次遍历
      * B.将各个元素传递给multiply函数==>新的Int
      * C.将得到新的Int,放入到一个新的集合，并返回
      * D.因此multiple函数调用3次
      */
    val list2 = list1.map(multiply)
    println(" list2 ="+list2)
    //深刻理解map映射函数的机制-模拟实现
    val myList = MyList()
    println(myList)
    val myList2 = myList.map(multiply)
    println("myList2 = "+myList2)


  }

  def multiply(n:Int):Int={
    println("multiply 被调用---")
    2*n
  }

}



/**
  * 深刻理解map映射函数的机制-模拟实现
  */
class MyList{
  val list1 = List(3,5,7,9)
  //新的集合
  var list2 = List[Int]()

  //写map
  def map(f:Int=>Int):List[Int]={
    //遍历集合
    for(item<-this.list1){
      list2 = list2 :+f(item)
    }
   list2
  }
}

object MyList{
  def apply():MyList = new MyList
}
