package com.lab.chapter12.unit03_var

/**
  * Created by 17081290 on 2020/6/29.
  * 清单12.3.
  * 模式匹配找那个的变量
  * 如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量
  *
  */
object MatchDemo03 {
  def main(args: Array[String]) {
    val ch = 'V'.toLower
      ch match {
      case '+' => println("ok----")
      case mychar => println("ok----" + mychar)
      case _ => println ("ok----")
    }

    /**
      * match 是一个表达式，因此有返回值
      * 返回值为匹配到的代码块 最后一句化的值
      */
    val ch1 = '+'
    val res =  ch1 match{
      case '+' =>{ch1 + "hello"; 3}
      case _ => println ("ok----")
    }
    println(" res = "+res)
  }

}
