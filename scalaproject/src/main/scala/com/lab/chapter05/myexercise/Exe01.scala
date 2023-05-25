package com.lab.chapter05.myexercise

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.7.1
  * 打印金子塔
  */
object Exe01 {
  def main(args: Array[String]) {
    printTri(4)
  }

  def printTri(n:Int)={
    for(i<-1 to n){
      for(j<- 1 to n-i){
        print(" ")
      }
      for(k<- 1 to 2*(i-1)+1){
        print("*")
      }
      for(j<- 1 to n-i){
        print(" ")
      }
     println()
    }
  }

}
