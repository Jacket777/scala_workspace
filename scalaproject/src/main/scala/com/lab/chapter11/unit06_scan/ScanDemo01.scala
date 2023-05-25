package com.lab.chapter11.unit06_scan

/**
  * Created by 17081290 on 2020/6/26.
  */
object ScanDemo01 {
  def main(args: Array[String]) {

    //5(1,2,3,4,,5)=>(5,5-1=4,4-2=2,2-3=-1,-1-4=-5,-5-5=-10)  //vector(5,4,2,-1,-5,-10)
    val i8 = (1 to 5).scanLeft(5)(minus)
    println(i8)
    //5(1,2,3,4,,5)=>(19+1=20,17+2=19,14+3=17.10+4=14,5+5=10,5)
    val i9 = (1 to 5).scanRight(5)(add) //IndexedSeq[Int]
    println(i9)



  }

  def minus( num1 : Int, num2 : Int ) : Int = {
    num1 - num2
  }

  def add( num1 : Int, num2 : Int ) : Int = {
    num1 + num2
  }


}
