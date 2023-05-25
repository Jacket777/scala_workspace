package com.lab.chapter11.unit12_syncollection

/**
  * Created by 17081290 on 2020/6/28.
  */
object ParDemo01 {
  def main(args: Array[String]) {
    (1 to 5).foreach(println(_))
    println("========")
    //输出结果为无序的，将print任务分配给不同的cpu
    (1 to 5).par.foreach(println(_))
    println("==========================")
    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}
    println(result1)
    println(result2)


  }

}
