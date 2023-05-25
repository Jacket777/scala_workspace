package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.3
  * 函数注意事项和细节讨论
  * (5).如果函数明确使用return关键字，那么函数返回就不能使用自行推断了,
  这时要明确写成 : 返回类型 =  ，
  当然如果你什么都不写，即使有return 返回值为()
  (6).如果函数明确声明无返回值（声明Unit），
  那么函数体中即使使用return关键字也不会有返回值
  (7).如果明确函数无返回值或不确定返回值类型，
  那么返回值类型可以省略(或声明为Any)


  */
object Deatils02 {
  def main(args: Array[String]) {
    val res = getSum(1,1)
    val res02 = getSum2(0,2)
    println("res = "+res)
    println("res02 = "+res02)
    val res03 = getSum3(2,2)
    println("res03 = "+res03)
    val resf3 = f3("abc")
    println("resf3 = "+resf3)
    val resf4 = f3("ab")
    println("resf4 = "+resf4)
  }


  /**
    * 明确返回类型
    */
  def getSum(n1:Int,n2:Int):Int={
    return n1 + n2
  }


  /**
  没有返回类型
  当然如果你什么都不写，即使有return 返回值为()
    */
  def getSum2(n1:Int,n2:Int){
    return n1 + n2
  }


  def getSum3(n1:Int,n2:Int):Unit={
    return n1 + n2
  }


  def f3(s:String)={
    if(s.length >= 3){
      s + "123"
    }else{
      3
    }
  }

  def f4(s:String):Any={
    if(s.length >= 3){
      s + "123"
    }else{
      3
    }
  }



}


