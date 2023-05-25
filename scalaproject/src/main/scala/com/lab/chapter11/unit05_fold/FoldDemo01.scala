package com.lab.chapter11.unit05_fold

/**
  * Created by 17081290 on 2020/6/26.
  */
object FoldDemo01 {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4)

    /**
      * 说明：
      * 1.折叠的理解与化简的运行机制几乎一样
      * 步骤1 list.foldLeft(5)(minus) 理解成 list.reduceLeft(minus)
      * 只是list成为List(5,1, 2, 3, 4)
      * *5-1)
      * ((5-1)-2)
      * (((5-1)-2)-3)
      * (((5-1)-2)-3)-4)
      *
      */

    println(list.foldLeft(5)(minus)) // 函数的柯里化

    /**
      *  * 1.折叠的理解与化简的运行机制几乎一样
      * 步骤1 list.foldRight(5)(minus) 理解成 list.reduceRight(minus)
      * 只是list成为List(1, 2, 3, 4,5)
      * 4-5=-1
      * 3-(4-5)=
      * 2-(3-(4-5))
      * 1-(2-(3-(4-5)))
      */
    println(list.foldRight(5)(minus)) //

  }

  def minus( num1 : Int, num2 : Int ): Int = {
    num1 - num2}

}
