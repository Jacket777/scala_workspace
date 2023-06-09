package com.lab.chapter09.homework

import java.awt.geom.Ellipse2D

/**
  * Created by 17081290 on 2020/6/23.
  * java.awt.Rectangle类有两个很有用的方法translate和grow,但可惜的是像java.awt.geom.Ellipse2D这样的类没有。在Scala中，你可以解决掉这个问题。定义一个RenctangleLike特质,加入具体的translate和grow方法。提供任何你需要用来实现的抽象方法,以便你可以像如下代码这样混入该特质:
val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
egg.translate(10,-10)
egg.grow(10,20)
  使用自身类型
  */
object Exercise02 {
  def main(args: Array[String]) {
    val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike2
    println("egg.x = "+egg.x+" egg.y = "+egg.y)
    egg.translate(10,-10)
    println("egg.x = "+egg.x+" egg.y = "+egg.y)
    egg.grow(10,20)
    println("egg.x = "+egg.x+" egg.y = "+egg.y)
  }
}

trait RectangleLike2 extends {
  this:Ellipse2D.Double =>
  def translate(x:Double,y:Double): Unit ={
    this.x = x
    this.y = y

  }

  def grow(x:Double,y:Double): Unit ={
    this.x += x
    this.y += y
  }
}
