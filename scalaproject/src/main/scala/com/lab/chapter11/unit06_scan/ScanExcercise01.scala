package com.lab.chapter11.unit06_scan

/**
  * Created by 17081290 on 2020/6/26.
  */
object ScanExcercise01 {
  def main(args: Array[String]) {
    val i8 = (1 to 3).scanLeft(3)(test)
    println(i8)

  }
def test(num1:Int,num2:Int): Int ={
  num1 * num2
}

}
