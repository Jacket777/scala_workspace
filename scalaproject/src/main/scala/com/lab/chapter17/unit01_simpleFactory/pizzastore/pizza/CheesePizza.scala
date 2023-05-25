package com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza

/**
  * Created by 17081290 on 2020/7/14.
  */
class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪 pizza"
    println(this.name + " preparing..")
  }
}