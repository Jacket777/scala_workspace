package com.lab.chapter02.unit02_datatype

/**
  * 清单2.7--整型与浮点数 与字符使用
  */
object TypeDemo03 {
  def main(args: Array[String]) {
    println("Byte max ="+Byte.MinValue+" "+Byte.MaxValue)
    println("long max =" + Long.MaxValue+" "+ Long.MinValue)
    var i = 10  //Int型
    var j = 200l  //Long型
    //var e = 9223372036854775807 报错 超过Int
    var e = 9223372036854775807L

    val num1:Float = 2.12345678912f  //会损失精度，保留小数点7位
    val num2:Double = 2.2345678912
    println("num1 = " + num1+ " num2 = "+ num2)



    val c1:Char = 'a'
    val c2:Char = '\t'
    val c3:Char = '你'
    val c4:Char = 97
    println(" c1 = "+c1+" c2 = "+c2+" c3 = "+c3+" c4 = "+c4)
    val char0:Char = '国'
    println("char0 = "+char0+" char0对应的码值 = "+char0.toInt)
    val char1:Char = 97
    println("char1 = " + char1)
    //char可以当数字进行运行
    val char2:Char = 'a'
    val num = 10 + char2  //char向Int隐式转换
    println("num = "+num)
    //1.当计算的结果交给变量，则编译器会进行类型转换及判断[会看范围和类型]
    //2.当我们把字面量赋给变量，编译器会进行范围的判定
    //var c2 :Char = 'a' + 1 //错误 Char只能接受常量
    //var c3:Char = 97 + 1  // 错误


    val t4:Char = 98
    println(" t4 = "+t4)
    //var c5:Char = 999999  超过范围了

  }
}
