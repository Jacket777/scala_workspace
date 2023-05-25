package com.lab.chapter10.unit01_array

/**
  * Created by 17081290 on 2020/6/10.
  * 清单9.5
  * 多维数组的定义和使用
  */
object MultiplyArray {
  def main(args: Array[String]) {
      //1.创建
      val arr = Array.ofDim[Int](3,4)
      //2.遍历
      for(item <- arr){ //取出二维数组的各个元素[一维数组]
        for(item2 <- item){//元素[一维数组]遍历
          println(item2 + "\t")
        }
      }
    println()
    println(arr(1))
    arr(1)(1) = 100
    println("=====================")
    for(item <- arr){
      for(item2 <- item){
        println(item2 + "\t")
      }
    }
    println()

    println("=========使用传统下标的方式遍历============")
    for(i<- 0 to arr.length -1){
      for(j <- 0 to arr(i).length -1){
        printf(" arr[%d][%d] = %d\t",i,j,arr(i)(j))
      }
    }


  }




}
