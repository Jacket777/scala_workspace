package com.lab.chapter03.assign

/**
  * Created by 17081290 on 2020/5/20.
  * 清单3.2.赋值运算
  */
object Demo01 {
  def main(args: Array[String]) {
    var num = 2
    num <<=2 //num=8
    num >>=3 //num=4

    //scala中支持代码块，返回值
    val res = {
      if (num >1)"hello"else 100
    }
    println("res="+res)

    //有两个变量，a,b，交换其值，不能用中间变量
    var a = 10
    var b = 20
    printf(s"a=%d, b =%d",a,b)
    a = a + b
    println()

    b = a - b  //==>(a+b)-b=a
    a = a - b  //==>(a+b)-a=b
    printf(s"a=%d, b =%d",a,b)

    //使用位运算
    a = a^b
    b = a^b
    a = a^b
    println()
    printf(s"a=%d, b =%d",a,b)


  }
}
