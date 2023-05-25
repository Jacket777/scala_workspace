package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.1
  * 函数注意事项和细节讨论
  * (2).形参列表和返回值列表的数据类型可以是值类型和引用类型
  * (3).Scala中的函数可以根据函数体最后一行代码自行推断函数返回值类型
  * 那么在这种情况下，return关键字可以省略
  * (4).因为Scala可以自行推断，所以在省略return关键字的场合，返回值类型也可以省略
  */
object Deatils01 {
  def main(args: Array[String]) {
    val tiger = new Tiger
    val tiger2 = test01(10,tiger)
    println(tiger2.name)
    println(tiger.name)
    println(tiger.hashCode()+" "+tiger2.hashCode())
    val res01 = getSum(1,2)
    println("getSum = "+res01)
    val res02 = getSum2(2,2)
    println("getSum2 = "+res02)

  }

  def test01(n1:Int,tiger:Tiger):Tiger={
    println(" n1 = "+n1)
    tiger.name = "Jack"
    tiger
  }

  /**
    *Scala中的函数可以根据函数体最后一行代码自行推断函数返回值类型。
    * 那么在这种情况下，return关键字可以省略
    */
  def getSum(n1:Int,n2:Int):Int={
    n1 + n2
  }

  /**
    *因为Scala可以自行推断，所以在省略return关键字的场合，
    * 返回值类型也可以省略
    */
  def getSum2(n1:Int,n2:Int)={
    n1 + n2
  }





}


class Tiger{
  var name = ""
}