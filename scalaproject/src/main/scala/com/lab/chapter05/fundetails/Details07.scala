package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  *   * 清单 5.3.8
  * 函数注意事项和细节讨论
  * (13).scala 函数支持可变参数.
  */
object Details07 {
  def main(args: Array[String]) {
     println(sum(10,30,10,3,45,7))
  }


  //可变参数需要放到最后
  def sum(n1:Int,args:Int*): Int ={
    println("args.length="+args.length)

    //遍历
    var sum = n1
    for(item <- args){
      sum += item
    }
    sum
  }
}
