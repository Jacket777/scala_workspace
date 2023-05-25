package com.lab.chapter08.innerClass

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.17
  * 类型投影
  *
  */
class ScalaOuterClass03 {
  myouter=> //这里理解为外部类的别名，看做事外部类的一个实例
  var name = "scoot"
  private var sal = 300.99

  class ScalaInnerClass03{
    def info(): Unit ={
      println(" name ="+myouter.name+" sal = "+myouter.sal)
    }


    //下面的ScalaOuterClass03#ScalaInnerClass03类型投影的作用就是屏蔽外部对象对内部类对象的影响
    def test(ic:ScalaOuterClass03#ScalaInnerClass03): Unit ={
      System.out.println("使用类型投影 "+ic)
    }
  }

}
