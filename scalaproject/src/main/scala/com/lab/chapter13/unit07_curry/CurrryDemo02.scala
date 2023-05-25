package com.lab.chapter13.unit07_curry

/**
  * Created by 17081290 on 2020/7/6.
  * 清单13.7.2.curry最佳实践
  *比较两个字符串在忽略大小写的情况下是否相等，注意，这里是两个任务：
全部转大写（或小写）
比较是否相等
针对这两个操作，我们用一个函数去处理的思想，其实也变成了两个函数处理的思想（柯里化）
  *
  */
object CurrryDemo02 {
  def main(args: Array[String]) {
    def eq(s1:String,s2:String):Boolean={
      s1.equals(s2)
    }

    //隐式类
    implicit class TestEq(s:String){
      //体现了将比较字符串的事情，分解成两个任务完成
      //1.checkEq完成转换大小写
      //2.f函数完成比较任务
      def checkEq(ss:String)(f:(String,String)=>Boolean):Boolean={
        f(s.toLowerCase,ss.toLowerCase)
      }
    }

    val str1 = "hello"
    println(str1.checkEq("Hello")(eq))
    println(str1.checkEq("Hello")((s1:String,s2:String)=>s1.equals(s2)))

    println(str1.checkEq("Hello")((s1,s2)=>s1.equals(s2)))

    println(str1.checkEq("Hello")(_.equals(_)))


  }

}
