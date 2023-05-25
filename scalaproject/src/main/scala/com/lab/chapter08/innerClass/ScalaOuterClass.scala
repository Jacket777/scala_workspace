package com.lab.chapter08.innerClass

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.15
  * 外部类
  * 内部类访问外部类的属性的方法 外部类名.this.属性
  *
  */
class ScalaOuterClass {
  var name = "scoot"
  private var sal = 300.99

  class ScalaInnerClass{


    def info: Unit ={
      //访问方式: 外部类名.this.属性名
      //怎么理解ScalaOuterClass.this 就相当于ScalaOuterClass 这个外部类的一个思路
      //然后通过ScalaOuterClass.this实例对象去访问name属性
      //只是这种写法比较特别，
      println(" name = "+ ScalaOuterClass.this.name+" sal ="+ScalaOuterClass.this.sal)

    }
  }


}
