package com.lab.chapter10.unit01_array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by 17081290 on 2020/6/10.
  * 清单 9.6
  * scala数组与java List
  */
object ArrayBufferToList {
  def main(args: Array[String]) {
     println("ArrayBuffer 转换为 List")
     val arr = ArrayBuffer("1","2","3")
     import scala.collection.JavaConversions.bufferAsJavaList
    /**
      * 说明：
      * bufferAsJavaList 为隐式函数--源代码
      */

    //对象processBuilder，因为用到上面的bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()  //这里arrList就是java中的List
     println(arrList)

    println("java.util.List  转换为 ArrayBuffer")

    /**
      * 说明：
      * asScalaBuffer为隐式函数
      */
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr:mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    scalaArr.append("tom")
    scalaArr.remove(0)
    println(scalaArr)





  }

}
