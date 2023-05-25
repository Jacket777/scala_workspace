package com.programe.ch03
import scala.io.Source

/**
  * Created by 17081290 on 2020/7/18.
  */
object Countchars1 {
  def main(args: Array[String]) {
    if(args.length > 0){
      for(line <- Source.fromFile(args(0)).getLines)
        println(line.length + " "+line )
    }else{
      Console.err.println("Please enter filename")
    }
  }
}
