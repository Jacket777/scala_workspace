package com.lab.chapter13.unit05_parameterInfer

/**
  * Created by 17081290 on 2020/7/2.
  * 清单13.5.1 类型推断
  * 参数类型是可以推断时，可以省略参数类型
   当传入的函数，只有单个参数时，可以省去括号
    如果变量只在=>右边只出现一次，可以用_来代替
  *
  */
object ObjectInferDemo01 {
  def main(args: Array[String]) {
    val list = List(1,2,3,4)
    //map是一个高阶函数，因此也可以直接传入一个匿名函数，完成map
    println(list.map((x:Int) => x+1))
    //当遍历list时，参数类型是可以推断出来的，可以省略数据类型Int
    println(list.map((x)=>x+1))
    //当传入的函数，只有单个参数时，可以省去括号
    println(list.map(x=>x+1))
    //如果变量只在=>右边只出现一次，可以用_来代替
    println(list.map(_+1))

    println(list.reduce(f1))
    println(list.reduce((n1:Int,n2:Int)=>n1+n2))
    println(list.reduce((n1,n2)=>n1+n2))
    println(list.reduce(_+_))

    val res = list.reduce(_+_)
    println("res = "+res)




  }

  def f1(n1:Int,n2:Int): Int ={
    n1 + n2
  }

}
