package com.lab.chapter12

/**
  * Created by 17081290 on 2020/6/28.
  * 清单12.1.1.match基本用法
  */
object MatchDemo01 {
  def main(args: Array[String]) {
    val oper = '+'
    val n1 = 20
    val n2 = 10
    var res = 0

    /**
      * 说明:
      * 1.match类似于java中switch
      * 2.=> 如果匹配成功，则执行后面的代码，代码可以有多行
      * 3.匹配的顺序从上到下，匹配到一个则执行
      * 4.后面的代码块无需break,它会自动退出match代码块
      * 5.如果一个都没有匹配到，则执行case_下面的代码块
      */
    oper match{
      case '+' =>{
        res = n1 + n2
        println("hello.....")
        println("world......")}
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case 1 => println("1.......")
      case 1.1 =>println("1.1.....")
      case _  => println("the error operate")
    }

    println("res = "+res)
  }

}
