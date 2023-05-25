package com.lab.chapter02.unit02_datatype

/**
  * 清单2.5 类型演示
  * Nothing使用与类型转换
  */
object TypeDemo01 {

  def main(args: Array[String]) {
    val num1:Int = 10
    //因为Int 是一类，因此它是一实例，可以使用很多方法
    println(num1.toDouble +"\t"+ num1.toString+"\t"+ 100.toString+"\t"+100.toDouble)
    sayHi()
    //如果一个方法中没有形参，则可以省去括号
    sayHi
    val isPass = true
    println(isPass.toString)

    //scala中 低精度向高精度转换
    val num = 1.2  //默认double
    var num2 = 1.7f //
    //num2 =num  //错误
    num2 = num.toFloat
    println(sayHello)

  }
  def sayHi():Unit = {
      println("say hi")
  }



  //比如开发中,我们有一个方法， 就会异常中断，这时可以返回Nothing
  //也就是说当我们Nothing作为返回值，就是说明该方法没有正常的返回值
  def sayHello:Nothing={
    throw new Exception("AAAAA")
  }

}

