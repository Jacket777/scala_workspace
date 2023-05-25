package com.lab.chapter08.innerClass

import com.lab.chapter08.innerClass.ScalaOuterClass02.ScalaStaticInnerClass

/**
  * Created by 17081290 on 2020/6/9.
  *  清单 8.16
  * 外部类
  * 内部类访问外部类的属性的方法 外部类名别名.属性
  */
object ScalaInnerClassDemo {
  def main(args: Array[String]) {
    //测试1. 创建两个外部类的实例
    val outer1:ScalaOuterClass02 = new ScalaOuterClass02
    val outer2:ScalaOuterClass02 = new ScalaOuterClass02

    //测试2 创建成员内容类的用法是 对象.内部类
    //在语法中可以看出，默认情况下内部类实例和外部对象关联
    val inner1 = new outer1.ScalaInnerClass02
    val inner2 = new outer2.ScalaInnerClass02

    //测试一下使用inner1去调用info
    inner1.info()

    //创建静态内部类实例
    val staticInner = new ScalaStaticInnerClass






  }

}


/**
  * 访问方式: 外部类名.this.属性名
  */
class ScalaOuterClass01 {
  var name = "scoot"
  private var sal = 300.99

  class ScalaInnerClass01{


    def info: Unit ={
      //访问方式: 外部类名.this.属性名
      //怎么理解ScalaOuterClass.this 就相当于ScalaOuterClass 这个外部类的一个思路
      //然后通过ScalaOuterClass.this实例对象去访问name属性
      //只是这种写法比较特别，
      println(" name = "+ ScalaOuterClass01.this.name+" sal ="+ScalaOuterClass01.this.sal)

    }
  }
}


/**
  * 访问方式: 外部类别名.属性名
  */
class ScalaOuterClass02{
  myouter=> //这里理解为外部类的别名，看做事外部类的一个实例
  var name = "scoot"
  private var sal = 300.99

  class ScalaInnerClass02{
    def info(): Unit ={
      println(" name ="+myouter.name+" sal = "+myouter.sal)
    }
  }
}


object ScalaOuterClass02{
  class ScalaStaticInnerClass{ //静态内部类

  }
}





