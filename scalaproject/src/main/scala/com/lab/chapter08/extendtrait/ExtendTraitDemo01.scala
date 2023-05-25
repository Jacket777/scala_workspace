package com.lab.chapter08.extendtrait

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.13
  * 特质继承与混入
  */
object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {
    println("=======")
  }
}


trait LoggedException2 extends Exception{
  def log(): Unit ={
    println(getMessage())  //方法来自Exception类
  }

}



//说明
//UnhappyException 继承了LoggedException2
//LoggedException2继承了Exception
//UnhappyException 就是Exception子类
class UnhappyException extends LoggedException2{
  //已经是Exception的子类，所以可以重写方法
  override def getMessage = "Wrong message!"
}


/**
  * 如果混入该特质的类，已经继承了另一个类（A类），则要求A类是特质超类的子类
  * 否则就会出现多继承现象，发生错误
  * UnhappyException2 继承了IndexOutOfBoundsException
  * IndexOutOfBoundsException 是特质 LoggedException2 超类Exception的子类
  */
class UnhappyException2 extends IndexOutOfBoundsException with LoggedException2{
  //已经是Exception的子类，所以可以重写方法
  override def getMessage = "Wrong message!"

}



class C1 extends Exception{

}

class UnhappyException3 extends C1 with LoggedException2{}  //错误