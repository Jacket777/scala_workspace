package com.lab.chapter10.unit02_tuple

/**
  * Created by 17081290 on 2020/6/10.
  * 清单 10.2.1
  * 元组的演示
  * 1.元组可以存放不同类型的数据
  * 2.元组中最大只能有22个元素
  */
object tupleDemo01 {
  def main(args: Array[String]) {
     //1.创建元组
     val tuple1 = (1,2,3,"hello",4)
     println(tuple1)
     //2.访问元组
     println(tuple1._1)   //通过顺序号 _顺序号
     println(tuple1.productElement(2))  //通过索引
     //3.遍历 调用其迭代器
     for(item <- tuple1.productIterator){
       println("item = "+item)
     }







  }

}
