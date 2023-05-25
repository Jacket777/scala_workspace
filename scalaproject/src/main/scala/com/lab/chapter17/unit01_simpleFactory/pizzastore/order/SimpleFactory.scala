package com.lab.chapter17.unit01_simpleFactory.pizzastore.order

import com.lab.chapter17.unit01_simpleFactory.pizzastore.pizza.{CheesePizza, PepperPizza, GreekPizza, Pizza}

import scala.util.control.Breaks._

/**
  * Created by 17081290 on 2020/7/14.
  */
object SimpleFactory {

//提供一个创建Pizza的方法，有需要创建Pizza调用方法即可
  def createPizza(t:String):Pizza={
    var pizza:Pizza = null
  if (t.equals("greek")) {
    pizza = new GreekPizza
  } else if(t.equals("pepper")) {
    pizza = new PepperPizza
  }else if(t.endsWith("cheese")){
    pizza = new CheesePizza
  }

  return pizza
  }



}
