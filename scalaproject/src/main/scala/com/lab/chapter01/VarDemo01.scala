package com.lab.chapter01

/**
  * Created by 17081290 on 2020/7/20.
  * 程序结构说明与转义字符
  */
object VarDemo01 {
  def main(args: Array[String]) {
    println("hello scala")


    /**
      * \t：一个制表位，实现对齐的功能
      * \n：换行符
      * \\：一个\
      * \" ：一个"
      * \r：一个回车  println("hello\rk");
      */
    println("姓名\t年龄")
    println("Jack\t20")
    println("hello Jack\nhello Tom")
    println("c:\\user\\desktop\\127")
    println("Jack say:\"good boy\"")
    println("hello\rk")  //只输入k

    println("======课后练习=============")
    /*
    P24
     */
    println("姓名\t年龄\t籍贯\t住址\nJohn\t12\t\t河北\t北京")
  }

}
