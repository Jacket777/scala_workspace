package com.lab.chapter11.unit12_syncollection

/**
  * Created by 17081290 on 2020/6/28.
  */
object ParDemo02 {
  def main(args: Array[String]) {
    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1)
    println(result2)
  }

}
