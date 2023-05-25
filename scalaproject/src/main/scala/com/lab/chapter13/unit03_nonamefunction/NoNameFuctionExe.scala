package com.lab.chapter13.unit03_nonamefunction

/**
  * Created by 17081290 on 2020/7/2.
  */
object NoNameFuctionExe {
  def main(args: Array[String]) {
    val f1 = (n1:Int,n2:Int)=>{
      println("no name function be called")
      n1 + n2
    }
    println(" f1的类型 = "+f1)
    println(f1(10,30))
  }

}
