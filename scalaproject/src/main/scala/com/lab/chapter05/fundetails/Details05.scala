package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.6
  * 函数注意事项和细节讨论
  * (10).如果函数存在多个参数，每一个参数都可以设定默认值，
  * 那么这个时候，传递的参数到底是覆盖默认值，
  * 还是赋值给没有默认值的参数，就不确定了(默认按照声明顺序[从左到右])。
  * 在这种情况下，可以采用带名参数
  */
object Details05 {
  def main(args: Array[String]) {
    //mysqlCon()
   // mysqlCon("127.0.0.1",7777) //从左到右覆盖
    //希望指定覆盖某个默认值，则使用带名参数即可
    mysqlCon(user="tom",pwd="123")
   // f6("v2") //错误
    f6(p2="v2")

  }

  def mysqlCon(add:String="localhost",port:Int=3306,
               user:String="root",pwd:String="root"): Unit ={
    println("add="+add)
    println("port="+port)
    println("user="+user)
    println("pwd="+pwd)
  }

  def f6(p1:String="v1",p2:String): Unit ={
    println(p1+p2)
  }

}
