package com.lab.chapter11.unit06_scan

import scala.collection.mutable

/**
  * Created by 17081290 on 2020/6/28.
  * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  * 使用映射集合，统计一句话中，各个字母出现的次数
  * 提示：Map[Char, Int]()
  * 使用scala的flodLeft折叠方式实现.

  */
object Exercise03 {
  def main(args: Array[String]) {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val map2 = sentence.foldLeft(Map[Char,Int]())(charCount)
    println("map2 = "+map2)
    //使用可变的map
    //1.先创建一个可变的map，作为左折叠第一个参数
    val map3 = mutable.Map[Char,Int]()
    sentence.foldLeft(map3)(charCount2)
    println("map3 = "+map3)



  }


  /**
    * 使用不可变map实现
    *
    * @param map
    * @param char
    * @return
    */
  def charCount(map:Map[Char,Int],char:Char): Map[Char,Int] ={
    map +(char->(map.getOrElse(char,0)+1))

  }

  /**
    * 使用可变map实现
    *
    * @param map
    * @param char
    * @return
    */
  def charCount2(map:mutable.Map[Char,Int],char:Char): mutable.Map[Char,Int] ={
    map += (char->(map.getOrElse(char,0)+1))

  }

}
