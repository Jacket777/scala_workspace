package com.lab.chapter06.dogcase

/**
  * Created by 17081290 on 2020/6/2.
  */
object DogCaseTest {
  def main(args: Array[String]) {
    val dog = new Dog
    dog.name = "tomcat"
    dog.age = 2
    dog.weight = 6
    println(dog.say())

  }
}


class Dog{
  var name=""
  var age=0
  var weight=0.0

  def say():String={
    "the dog information：name= "+this.name+"\tage="+this.age+"\tweight="+this.weight
  }

}