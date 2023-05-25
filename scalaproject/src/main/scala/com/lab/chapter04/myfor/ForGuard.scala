package com.lab.chapter04.myfor

/**
  * Created by 17081290 on 2020/5/21.
  */
object ForGuard {
  def main(args: Array[String]) {
    for( i <- 1 to 3 if i!=2){
      print(i+" ")
    }
  }

}
