package com.lab.chapter10.unit01_array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by 17081290 on 2020/6/10.
  * 清单9.4
  * 定长数组与变长数组的转换
  *
  */
object ArrayToBuffer {
  def main(args: Array[String]) {
    val arr01 = ArrayBuffer[Int]()
    arr01.append(1,2,3)
    println(arr01)

    val newArr = arr01.toArray
    println(newArr)

    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)



  }

}
