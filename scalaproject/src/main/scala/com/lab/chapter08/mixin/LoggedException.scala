package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.12
  * 特质可以继承类，用来拓展该特质的一些功能
  *
  * 说明:
  * 1.LoggedException继承了 Exception
  * 2.LoggedException 特质可以有 Exception
  */
trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage())
  }
}

  /**
    * 说明：
    * 因为UnhappyException继承了LoggedException
    * 又因为LoggedException继承了Exception
    * 所以UnhappyException是Exception的子类
    *
    */
  class UnhappyException extends LoggedException{
    //已经是Exception子类，所以可以重写getMessage方法
    override def getMessage = "错误信息"

  }


/**
  * 说明：
  * 如果混入该特质的类继承了其他的类，则要求该类必须为混入特质的超类的子类
  * 否则则发生多继承错误
  */
 class UnhappyException2 extends IndexOutOfBoundsException with LoggedException{
   //已经是Exception子类，所以可以重写getMessage方法
   override def getMessage = "错误信息"
 }


class TEST2 extends Exception{

}


class UnhappyException3 extends TEST2 with LoggedException{
  override def getMessage = "错误信息"
}

object test{
  def main(args: Array[String]) {
    println("========")
  }
}






