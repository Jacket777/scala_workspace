package com.lab.chapter05.fun

/**
  * 清单 5.1.1
  * 函数基本说明
  *
  */
object FunDemo01 {
  def main(args: Array[String]) {
    val n1 = 10
    val n2 = 20
    println("res = "+getRes(n1,n2,'-'))

  }
  //定义函数/方法
  def getRes(n1:Int,n2:Int,oper:Char)= {
    if(oper=='+'){
      n1 + n2
    }else if(oper == '-'){
      n1 - n2
    }else{
      null
    }
  }


}
