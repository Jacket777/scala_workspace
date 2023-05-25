package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.11
  * 特质的构造器
  */
object MixInSeq {
  def main(args: Array[String]) {
    //F的形式 class F extends E with C with D
    /**
      *调用当前类的超类构造器---输出E
      * 第一个特质的父特质构造器---输出A， B
      * 第一个特质构造器---输出C
      * 第二个特质构造器的父特质构造器，如果已经执行过，就不再执行
      * 第二个特质构造器---输出D
      * 重复4,5的步骤（如果有第3,4个特质）
      * 当前类构造器---输出F
      */
    val f1 = new F
    println(f1)
    println("=================")


    /**
      *这是动态混入
      * 先创建K对象，然后再混入其他特质
      * 1.调用当前类的超类构造器 ---输出
      * 2.当前类构造器
      * 3.第一个特质构造器的父特质构造器
      * 4.第一个特质构造器
      * 5.第二个特质构造器的父特质构造器
      * 6.第二个特质构造器
      * 7.当前类构造器
      */

    val f2 = new K with C with D
    println(f2)


  }

}

trait A {
  println("A....")
}

trait B extends A{
  println("B....")
}

trait C extends B{
  println("C....")
}

trait D extends B{
  println("D....")
}

class E{
  println("E...")
}

class F extends E with C with D{
  println("F....")
}

class K extends E {
  println("K.....")
}
