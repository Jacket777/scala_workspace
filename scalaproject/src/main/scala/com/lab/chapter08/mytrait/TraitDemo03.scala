package com.lab.chapter08.mytrait

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.6.
  * 特质中包含具体方法
  */
object TraitDemo03 {
  def main(args: Array[String]) {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}



//说明:当一个trait有抽象方法和非抽象方法时
//1.一个trait在底层对应两个Trait03.class
//2.还对应Trait03$class.class Trait03$class抽象类
trait Trait03{
  //抽象方法
  def sayHi()
  //实现普通方法
  def sayHello(): Unit ={
    println("say hello ~~")
  }
}




//说明：当trait有接口和抽象类时
//1.class Sheep extends Trait03 在底层对应的是 class Sheep implements Trait03
//2.当在Sheep类中要使用Trait03的实现的方法，就是通过Trait03$class
class Sheep extends Trait03{
  override def sayHi(): Unit ={
    println("sheep say hi----")
  }
}
