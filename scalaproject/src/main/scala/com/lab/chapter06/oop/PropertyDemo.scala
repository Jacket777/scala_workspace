package com.lab.chapter06.oop

/**
  * 清单6.1.2
  * 类属性的使用
  */
object PropertyDemo {
  def main(args: Array[String]) {
    val p1 = new P
    println(p1.Name)
    println(p1.address)
    val a = new B
    println(a.var1)
    println(a.var2)
    println(a.var3)
    println(a.var4)
  }
}

class P{
  var age:Int = 10
  var sal =800.98
  var Name = null  //类型为null
  var address:String = null //仍然为字符串类型

}

class B{
  var var1:String = _ //默认值为 null，如果是引用类型也为null
  var var2:Byte = _//0  Int Long,
  var var3:Double = _//0.0 Float
  var var4:Boolean = _//false
}
