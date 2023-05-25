package com.lab.chapter09

/**
  * Created by 17081290 on 2020/6/9.
  * 清单9.1
  * 隐式转换函数
  * 1.隐式转换函数的函数名可以任意，隐式函数与函数名无关，只与函数签名（函数参数类型和返回值类型有关
  * 2.隐式函数可以有多个，但是需要保证在当前环境下，只有一个隐式函数能识别
  */
object ImplicitDemo01 {
  def main(args: Array[String]) {

    //隐式函数应当在作用域才能生效
    implicit def f1(d:Double): Int ={ //底层生成f1$1
      d.toInt
    }

    val num:Int = 3.5    //底层编译 f1$1(3.5)
    println("num = "+num)


    implicit def f2(f:Float): Int ={
      f.toInt
    }

    val num2:Int = 4.5f
    println("num2 = "+num2)

    //必须保证隐式函数的匹配只能是唯一的
//    implicit def f3(f1:Float): Int ={
//      f1.toInt
//    }


    /**
      * public void main(String[] args)
  {
    int num = f1$1(3.5D);
    Predef..MODULE$.println("num = " + num);

    int num2 = f2$1(4.5F);
    Predef..MODULE$.println("num2 = " + num2);
  }

  private static final int f1$1(double d)
  {
    return (int)d;
  }

  private static final int f2$1(float f)
  {
    return (int)f;
  }

      */


  }

}
