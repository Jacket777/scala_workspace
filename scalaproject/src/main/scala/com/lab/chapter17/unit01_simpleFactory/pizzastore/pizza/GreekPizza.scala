package com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza

/**
  * Created by 17081290 on 2020/7/14.
  */
class GreekPizza extends Pizza{ //写
   override def prepare(): Unit = {
  this.name = "希腊pizza"
  println(this.name + " preparing..")
}}
