package com.lab.chapter13.unit01_partialFunction

/**
  * Created by 17081290 on 2020/7/2.
  *
  */
object PartialFunDemo02 {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4, "abc")
    /**
      * 偏函数定义说明
      * 1.PartialFunction[Any,Int]表示偏函数接收的参数类型是Any,返回类型是Int
      * 2.isDefinedAt(x: Any) 如果返回true,就会调用apply构建对象实例，如果是false,则过滤
      * 3.apply构造器，对于传入的值加1，并返回新的集合
      */
    val partialFun = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = {
        println("x = "+x)
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        println("v1 = "+v1)
        v1.asInstanceOf[Int] +1
      }
    }

    /**
      * 使用偏函数
      * A.注意事项：如果是使用偏函数，则不能用map，应该使用collect
      * B.偏函数执行流程
      * 1.遍历list所有元素
      * 2.然后调用 val element = if(partialFun -isDefinedAt(list 单个元素){
      * partialFun-apply(list单个元素)})
      * 3.每得到一个element放入到新的集合，最后返回
      */
    val list2 = list.collect(partialFun)
    println("list2 = "+list2)



  }

}
