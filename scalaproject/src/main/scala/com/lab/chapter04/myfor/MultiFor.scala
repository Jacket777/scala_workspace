package com.lab.chapter04.myfor

/**
  * 清单4.6.4.嵌套循环.
  */
object MultiFor {
  def main(args: Array[String]) {
    for(i <- 1 to 3;j<- 1 to 3){
      println("i="+i+"j="+j)
    }

    println("======other=========")
    for(i<- 1 to 3){
      for(j<- 1 to 3){
        println("i="+i+"j="+j)
      }
    }

  }

}
