package com.lab.chapter06.constructor

/**
  * Created by 17081290 on 2020/6/4.
  * 构造器调用演示---父类 主构造器，辅助构造器
  */
object ConDemo02 {
  def main(args: Array[String]) {
    val a = new AA
    println("---------------------")
    val b = new AA("jack")
    //输出的顺序时
    //1.b===== 父类
    //2.AA()主构造器
    //3. A this(name:String) 辅助构造器

  }

}
class BB {
  println("b=====")
}

class AA  extends BB {
  println("AA()======")
  def this(name:String){
    this //调用A的主构造器
    println("A this(name:String)")
  }

}
