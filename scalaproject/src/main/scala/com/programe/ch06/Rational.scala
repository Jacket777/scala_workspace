package com.programe.ch06

/**
  * Created by 17081290 on 2020/7/20.
  */
class Rational(n: Int, d: Int) {
  //println("Created "+n+"/"+d)

  require(d != 0)
  private val g = gcd(n.abs,d.abs)
  val numer = n /g//分子
  val denom = d /g //分母

  def this(n: Int) = this(n, 1) //auxiliary constructor

  override def toString = numer + "/" + denom



  def lessThan(that:Rational)=
  this.numer*that.denom < that.numer*this.denom

  def max(that:Rational)=
  if(this.lessThan(that))that else this



  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(that:Rational):Rational=
  new Rational(
    numer*that.denom+that.numer*denom,
    denom*that.denom
  )

  def *(that:Rational):Rational=
    new Rational(numer*that.numer,denom*that.denom)

  def +(i:Int):Rational=
  new Rational(numer+i*denom,denom)

  def -(that:Rational):Rational=
  new Rational(
    numer*that.denom-that.numer*denom,
    denom*that.denom
  )

  def -(i:Int):Rational=
  new Rational(numer-i*denom,denom)


 //方法重载
  def *(i:Int):Rational=
  new Rational(numer*i,denom)

  def /(that:Rational):Rational=
  new Rational(numer*that.denom,denom*that.numer)

  def /(i:Int):Rational=
  new Rational(numer,denom*1)


  //求最大公约数
  private def gcd(a: Int, b: Int): Int = {
    //println("the a = " + a + " the b =" + b)
    if (b == 0) a else gcd(b, a % b)
  }
}


object Test {
  def main(args: Array[String]) {
    val x = new Rational(1,2)
    val y = new Rational(2,3)
    println(" x = "+x +"y="+y)

    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    println(oneHalf add twoThirds)

    val r = new Rational(1,2)
    println("r.num = "+r.numer)
    println("r.denom = " +r.denom)

    val result = x +y
    val result01 = x.+(y)
    println(" the result is "+result+" the result01 is "+result01)

    println(new Rational(66, 42))


    val result02 = x + x*y
    println("x + x*y  is "+result02)
    val result03 = (x + x)*y
    println("(x + x)*y  is "+result03)
    val result04 =  x +(x*y)
    println(" x +(x*y) is "+result04)


    //重载测试
    val result05 = y*y
    val result06 = y*2
    println(" result05 is "+result05+" result06 is "+result06)




  }



  implicit def intToRational(x:Int) = new Rational(x)
}
