package com.lab.chapter11.unit06_scan

import scala.collection.mutable.ArrayBuffer

/**
  * Created by 17081290 on 2020/6/26.
  *val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  * 将sentence 中各个字符，通过foldLeft存放到 一个ArrayBuffer中
  * 目的：理解flodLeft的用法.

  *
  *
  */
object ScanExcercise02 {
  def main(args: Array[String]) {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arr = ArrayBuffer[Char]()

    val arr02 =sentence.foldLeft(arr)(putArry)
    println("arr02 = "+arr02)


  }


  def putArry( arr : ArrayBuffer[Char], c : Char ): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }


}
