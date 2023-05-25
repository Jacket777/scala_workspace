package com.programe.ch03

import scala.io.Source

/**
  * Created by 17081290 on 2020/7/18.
  */
object Countchars2 {
  def main(args: Array[String]) {
    if(args.length > 0){
      //将getLines返回的迭代器转换为List
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft(
        (a,b) => if(a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)
      println("maxWidth = "+maxWidth)
      for(line <- lines){
        val numSpace = maxWidth - widthOfLength(line)
        val padding = " "*numSpace
        println(padding + line.length +" | "+line )
      }
    }else{
      Console.err.println("Please enter filename")
    }
  }

  //计算传入的字符串长度的数值的长度
  def widthOfLength(s:String) = s.length.toString.length

}
