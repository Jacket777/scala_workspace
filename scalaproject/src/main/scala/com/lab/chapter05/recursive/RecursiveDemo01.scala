package com.lab.chapter05.recursive

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.2.1
  * 函数recursive基本说明
  */
object RecursiveDemo01 {
  def main(args: Array[String]) {
    //test(4)
    test2(4)

  }


  def test(n:Int){
    if(n >2){
      test(n-1)
    }
  println("n = "+n)
  }


  def test2(n:Int){
    if(n > 2){
      test2(n-1)
    }else{
      println("n = "+n)
    }
  }

}


