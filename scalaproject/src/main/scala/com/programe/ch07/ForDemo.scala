package com.programe.ch07

/**
  * Created by 17081290 on 2020/7/28.
  */


object ForDemo {
  def main(args: Array[String]) {
    val filesHere = (new java.io.File(".")).listFiles()
    for(file <- filesHere)
      println(file)
    println("--------------------------")
    for(i<- 1 to 4)
      println("Iteration "+i)
    println("--------------------------")
    for(i <- 1 until 4)
      println("Iteration "+i)

    println("--------------------------")
    //过滤
    for(file <- filesHere if file.getName.endsWith("xml"))
      println(file)
    println("--------------------------")
    for(file <- filesHere)
      if (file.getName.endsWith("xml"))
        println(file)

    println("--------------------------")
    for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith("xml")
    )println("===="+file)


  }


  def fileLines(file:java.io.File)=
  scala.io.Source.fromFile(file).getLines().toList





}
