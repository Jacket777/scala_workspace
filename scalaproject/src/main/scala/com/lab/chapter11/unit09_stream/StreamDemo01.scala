package com.lab.chapter11.unit09_stream

/**
  * Created by 17081290 on 2020/6/28.
  */
object StreamDemo01 {
  def main(args: Array[String]) {
    //创建Stream
    def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1) //
    //取出第一个元素
    println("head=" + stream1.head) //
    println(stream1.tail) //
    println(stream1) //?

    def multi(x:BigInt) : BigInt = {
      x * x
    }
    println(numsForm(5).map(multi)) //? (25,?)


  }

}
