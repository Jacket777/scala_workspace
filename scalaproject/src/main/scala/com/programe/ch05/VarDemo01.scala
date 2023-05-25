package com.programe.ch05

/**
  * Created by 17081290 on 2020/7/23.
  */
object VarDemo01 {
  def main(args: Array[String]) {
    //整型16进制
    val hex = 0x5
    val hex2 = 0x00FF
    val magic = 0xcafebabe
    println("hex = "+hex+" hex2 = "+hex2+" magic = "+magic)
    val dec1 = 31
    val dec2 = 255
    val dec3 = 20
    println("dec1 = "+dec1+" dec2 = "+dec2+" dec3 = "+dec3)
    //长整型
    val prog = 0XCAFEBABEL
    val tower = 35L
    val of = 31L
    println("prog = "+prog+" tower = "+tower+" of = "+of)
    //byte
    val little:Short = 367
    val littler:Byte = 38
    println("little = "+little+" littler = "+littler)

    //Double
    val big = 1.2345
    println(" the big type is double "+big.isInstanceOf[Double])
    val bigger = 1.2345e1
    val biggerStill = 123E45
    println("big = "+big+" bigger = "+bigger+" biggerStill"+biggerStill)

    //Float
    val littleFloat:Float = 1.2345F
    val littleBigger = 3e5F
    println(" littleFloat = "+littleFloat+" littleBigger = "+littleBigger)

    val anotherDouble = 3e5
    val yetAnotherDouble = 3e5D
    println(" anotherDouble = "+anotherDouble+" yetAnotherDouble = "+yetAnotherDouble)

    //Character literals
    val a  = 'A'
    val d = '\u0041'
    val f = '\u0044'
    val backslash = '\\'
    println(" a = "+a+" d = "+d+" f = "+f+" backslash = "+backslash)

    val hello = "hello"
    val escapes = "\\\"\'"
    println(" hello = "+hello+" escapes = "+escapes)

    println(
      """Welcome to Ultamix 3000.
        |Type "HELP" for help """.stripMargin)


    updateRecordByName('favoriteAlbum,"OK")

    val s = 'aSymbol
    val nm = s.name
    println(" s = "+s+" s.name = "+nm)


    //Boolean
    val bool = true
    val fool = false
    println(" bool = "+bool+" fool = "+fool)

    //String interpolation
    val name = "reader"
    println(s"Hello, $name")
    println(s"The answer is ${6*7}")
    println(raw"No\\\\escape!") //4个下划线
    println(s"No\\\\escape!")  //两个下划线
    println(f"${math.Pi}%.5f")

    val pi = "pi"
    println(f"$pi is approximately ${math.Pi}%.8f")


    //Operators are methods
    val sum = 1 + 2
    val sumMore = 1.+(2)
    val longSum = 1 + 2L
    val s1 = "Hello,world!"
    val index = s1.indexOf('o')
    val index2 = s1.indexOf('o',5)
    println(" sum = "+sum+" sumMore = "+sumMore+" longSum = "+longSum)
    println(s1.toLowerCase()+" "+s1.toUpperCase)
    println(" s1.indexOf('o') = "+index)
    println(" s1.indexOf('o',5) = "+index2)

  }

  def updateRecordByName(r:Symbol,value:Any)={
    println("r = "+r+" any = "+value)
  }








}
