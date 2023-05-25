package com.lab.chapter01

/**
  * 清单1.2
  * 1.字符串三种输出方式
  * 2.注释
  * 3.查看源码 查看源码的方式ctr-b
  */
object printDemo {
  def main(args: Array[String]) {

    val str1: String = "hello"
    val str2: String = "world"
    println(str1 + str2)
    val name: String = " TOM"
    val age: Int = 10
    val sal: Float = 10.67f
    val height: Double = 180.15
    //format
    printf("name is %s age is %d sal is %.3f", name, age, sal)
    //默认保留小数点6位，.3保留三位

    //scala支持$输出内容,编译器会去解析$对应的变量
    //s告诉编译器后面有变量需要解析
    println(s"Information：\n name is $name \n age is $age \n sal is $sal")
    //如果字符串中出现类似${age+10}形式，则表示表达式
    println(s"Information：\n name is ${name} \n age is ${age + 10} \n sal is ${sal + 1}")


    val arr = new Array[Int](10)
    //对代码格式化格式快捷键ctr + alt +l
    for (item <- arr)
      println("item=" + item)


  }

  /**
    * @deprecated
    * @example
    * 输入 n1,n2，返回两数之和
    * @param n1
    * @param n2
    * @return 和
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}