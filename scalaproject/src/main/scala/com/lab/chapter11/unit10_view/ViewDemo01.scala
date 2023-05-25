package com.lab.chapter11.unit10_view

/**
  * Created by 17081290 on 2020/6/28.
  */
object ViewDemo01 {
  def main(args: Array[String]) {
    def multiple(num: Int): Int = {
      num}


    /**
      * 如果一个数，逆序后和原来的数相等，就返回true,否则返回false
      * @param i
      * @return
      */
    def eq(i: Int): Boolean = {
      println("==eq exe=")
      i.toString.equals(i.toString.reverse)
    }
    //说明: 没有使用view
    val viewSquares1 = (1 to 100).filter(eq)


    println("viewSquares1 = "+viewSquares1)
    println("=======================================")
    //for (x <- viewSquares1) {}
    //使用view
    /**
      * 程序中，对集合进行map,filter，reduce,fold...
      * 如果不马上使用，则使用view来使用
      *
      */
    val viewSquares2 = (1 to 100)
      .view
      .filter(eq)
    println("viewSquares2 = "+viewSquares2)
    //遍历
    for(item<-viewSquares2){
      println("item ="+item)
    }


  }

}
