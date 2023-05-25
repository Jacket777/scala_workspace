package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.5
  * 函数注意事项和细节讨论
  * (9).Scala函数的形参，在声明参数时，直接赋初始值(默认值)，
  * 这时调用函数时，如果没有指定实参，则会使用默认值。如果指定了实参，
  * 则实参会覆盖默认值。
  */
object Details04 {
  def main(args: Array[String]) {
    println(sayOk())
    println(sayOk("mary"))

  }

  def sayOk(name:String="Jack"):String={
    return name+" ok"
  }
}
