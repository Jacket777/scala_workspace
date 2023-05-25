package com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza

/**
  * Created by 17081290 on 2020/7/14.
  */
abstract class Pizza { //写
var name:String = _
  //假定，每种pizza 的准备原材料不同，因此做成抽象的..
  def prepare()
  def cut(): Unit = {
    println(this.name + " cutting ..")
  }
  def bake(): Unit = {
    println(this.name + " baking ..")
  }
  def box(): Unit = {
    println(this.name + " boxing ..")
  }
}
