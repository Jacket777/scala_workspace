package com.lab.chapter08

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.1.
  * 伴生对象演示
  */
object AccompanyObject {
  def main(args: Array[String]) {
    println(ScalaPerson.sex)  // true 在底层等价于ScalaPerson$.MODULE$.sex()
    ScalaPerson.sayHi()       //在底层等价于ScalaPerson$.MODULE$.sayHi()

  }

}


//说明
//1.当在同一个文件中，有class ScalaPerson 和 object ScalaPerson
//class ScalaPerson 称为伴生类，将非静态的内容写到该类中
//object ScalaPerson 称为伴生对象，将静态的内容写入到该对象（类）
//class ScalaPerson 编译后底层生成ScalaPerson类 ScalaPerson.class
//object ScalaPerson 编译后底层生成ScalaPerson$类ScalaPerson$.class
//2.对于伴生对象的内容，可以直接通过ScalaPerson.属性，或者方法



//伴生类
class ScalaPerson{
  var name:String = _
}

//伴生对象
object ScalaPerson{
  var sex:Boolean = true
  def sayHi(): Unit ={
    println("object ScalaPerson say HI---")
  }
}
