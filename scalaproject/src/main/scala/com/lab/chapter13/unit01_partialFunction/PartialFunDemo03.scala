package com.lab.chapter13.unit01_partialFunction

/**
  * Created by 17081290 on 2020/7/2.
  * 清单 13.1.3
  * 偏函数简写
  */
object PartialFunDemo03 {
  def main(args: Array[String]) {
    val list = List(1,2,3,4,1.2,2.4,1.9f,"hello")

    /**
      * 偏函数简化
      * @return
      */
    def partialFun2:PartialFunction[Any,Int]={
      case i:Int => i+1
      case j:Double => (j*2).toInt
    }


    val list2 = list.collect(partialFun2)
    println(" list2 = "+list2)

    /**
      * 偏函数简写
      */
    val list3 = list.collect{
      case i:Int => i +1
      case j:Double => (j*2).toInt
      case k:Float =>(k*3).toInt
    }

    println("list3 = "+list3)

  }

}
