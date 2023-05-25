package com.lab.chapter17.unit01_simpleFactory.pizzastore.order

/**
  * Created by 17081290 on 2020/7/14.
  */

import com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza.{Pizza, PepperPizza, GreekPizza}

import scala.io.StdIn
import scala.util.control.Breaks._
import scala.io.StdIn
class OrderPizza {
  var orderType:String = _
  var pizza:Pizza = _
  breakable {
    do {
      println("请输入pizza的类型")
      orderType = StdIn.readLine()

      pizza = SimpleFactory.createPizza(orderType)
      if(pizza == null){
        break()
      }

//      if (orderType.equals("greek")) {
//        this.pizza = new GreekPizza
//      } else if (orderType.equals("pepper")) {
//        this.pizza = new PepperPizza
//      } else {
//        break()
//      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }}

