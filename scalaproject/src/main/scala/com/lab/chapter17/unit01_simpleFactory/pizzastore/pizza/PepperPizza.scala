package com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza

/**
  * Created by 17081290 on 2020/7/14.
  */
class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + " preparing..")
  }

}
