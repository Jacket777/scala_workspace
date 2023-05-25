package com.programe.ch07

/**
  * Created by 17081290 on 2020/7/28.
  * IF演示
  */
object IFDemo {
  def main(args: Array[String]) {
    var filename = "default.txt"
    if(! args.isEmpty)
       filename = args(0)
    println("filename is "+filename)

    val filename2 =
      if(! args.isEmpty) args(0)
      else "default2.txt"
    println("filename2 is "+filename2)


    println(if(!args.isEmpty) args(0)else "default.txt")
  }

}
