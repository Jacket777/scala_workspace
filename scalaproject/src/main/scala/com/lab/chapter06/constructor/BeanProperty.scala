package com.lab.chapter06.constructor
import scala.beans.BeanProperty

/**
  * Created by 17081290 on 2020/6/2.
  * Bean属性演示
  *
  */
object BeanProperty {
  def main(args: Array[String]) {
    val car = new Car
    car.name = "BMW"
    println(car.name)
    //使用@BeanProperty自动生成getXXX和setXXX
    car.setName("Benze")
    println(car.getName)
  }
}

class Car{
@BeanProperty var name:String = null
}
