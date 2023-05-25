package com.lab.chapter02.unit01_vars

/**
  * 清单 2.4
  * var与val区别值
  * 变量必须有初始值
  */
object VarDemo03 {
  var name = "hello"
  val age = 100

  def main(args: Array[String]) {
    println("ok")

  }
}

/**
  * 对应的底层反编译代码
  * public final class VarDemo03$
   {
  public static  MODULE$;
  private String name;
  private final int age;
  ......}
  */
