package com.lab.chapter03.notice

/**
  * Created by 17081290 on 2020/5/21.
  * 清单3.3.注意事项
  */
object Demo01 {
  def main(args: Array[String]) {
    val num = if(5>4) 5 else 4
    //val num2=5>4?5:4 错误

    /*
     案例 1.计算两个数的最大值
     案例 2.计算三个数的最大值
     */
    val n1 = 4
    val n2 = 8
    var res = if(n1 > n2) n1 else n2
    println("res="+res)

    val n3 = 11
    res = if(res>n3)res else n3
    println("res="+res)



  }
}
