package com.lab.chapter11.unit07_zip

/**
  * Created by 17081290 on 2020/6/28.
  */
object ZipDemo01 {
  def main(args: Array[String]) {
    val list1 = List(1, 2 ,3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2) // (1,4),(2,5),(3,6)
    println("list3=" + list3)
    for(item<-list3){
      println(item._1+" "+item._2)
    }

  }

}
