package com.lab.chapter11.unit01_mapop

/**
  * Created by 17081290 on 2020/6/12.
  * 清单11.1.1
  */
object MapOperateDemo01 {
  def main(args: Array[String]) {
    /**
      *要求：请将List(3,5,7) 中的所有元素都 * 2 ，
      *将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14),
      * 请编写程序实现.
      */
    val list1 = List(3,5,7)  //集合

    /**
      *1.使用传统的方法解决
      */
    var list2 = List[Int]()  //新的集合
    for(item <- list1){      //遍历
      list2 = list2:+item*2  //对元素*2,然后加入list2集合
    }
    println("list2 = "+list2)

    /**
      * 使用传统的方法总结
      * 1.优点：处理方式比较直接，好理解
      * 2.缺点：
      * A.不够简洁，高效
      * B.没有体现函数式编程特点，集合-->函数-->新的集合--->函数..
      * C.不利于处理复杂的数据处理业务
      */

  }

}
