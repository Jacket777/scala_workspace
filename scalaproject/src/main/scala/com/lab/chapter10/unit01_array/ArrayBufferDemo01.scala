package com.lab.chapter10.unit01_array
import scala.collection.mutable.ArrayBuffer

/**
  * Created by 17081290 on 2020/6/9.
  * 清单9.3
  * 数组--变长数组
  * 说明
  * 1.ArrayBuffer是变长数组，类似java的ArrayList
  * 2.val arr = ArrayBuffer[Int]() 也是用apply方法构建对象
  * 3.def append(elems:A*){appendAll(elems)}接收的是可变参数
  * 4.每append一次，arr在底层会重新分配空间，进行扩容，arr的内存地址会发生变化，夜就称为新的ArrayBuffer
  */
object ArrayBufferDemo01 {
  def main(args: Array[String]) {
      //1.创建ArrayBuffer
      val arr01 = ArrayBuffer[Any](3,2,5)
      //2.访问 查询
      println("arr01 = "+arr01)  //查询整个可变数组
      println("arr02 = "+ arr01(1)) //通过下标访问元素
      //3.遍历
      for(i <-arr01){
        println(i)
      }
      //4.遍历长度
      println(arr01.length)
      //5.对象的hashcode值
      println("arr01.hash = "+arr01.hashCode())
      //6.修改 [修改值，动态增加]
      //使用append追加数据，append支持可变参数
      arr01.append(90.3,13.2)
      println("arr01.hash = "+arr01.hashCode())
      println("==========修改======================")
      //7.修改
      arr01(1) = 89
      println("----------修改后数组------------------")
      for(i<- arr01){
      println(i)
    }


    arr01.remove(0)
    println("--------删除后元素的遍历------------")
    for(i<- arr01){
      println(i)
    }


    println("最新的长度 = "+arr01.length)



  }

}
