package com.programe.ch07

/**
  * Created by 17081290 on 2020/7/28.
  */
object LoopDemo {
  def main(args: Array[String]) {
    println(" 10 5 "+gcd(10,5))
    println(" 10 5 "+gcdLoop(10,5))
  }



  def gcdLoop(x:Long,y:Long):Long ={
    var a = x
    var b = y
    while( a!=0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x:Long,y:Long):Long=
   if(y == 0) x else gcd(y,x%y)

}
