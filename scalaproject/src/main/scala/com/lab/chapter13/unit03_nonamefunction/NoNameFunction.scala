package com.lab.chapter13.unit03_nonamefunction

/**
  * Created by 17081290 on 2020/7/2.
  */
object NoNameFunctionDemo01 {
  def main(args: Array[String]) {
    val triple = (x:Double)=>{
      println(" x = "+x)
      3*x
    }

    println(" triple "+triple(3))

  }

}
