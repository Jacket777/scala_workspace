package com.lab.chapter12.unit08_matchObject

/**
  * Created by 17081290 on 2020/6/29.
  */
object MatchObjectDemo01 {
  def main(args: Array[String]) {
    /**
      * 模式匹配
      */
    val number:Double = Square(36.0)
     number match {
       case Square(n)=>println("匹配成功 n= "+ n)
       case _=>println("nothing matched")
     }

  }

}



object Square {
  /**
    * 说明
    * 1.unapply是对象提取器
    * 2.接受z: Double参数类型
    * 3.返回类型是 Option[Double]
    * 4.返回的值是Some(math.sqrt(z))，返回z的开平方值，并放入到Some(x)
    * @param z
    * @return
    */
  def unapply(z: Double): Option[Double] = {
    println("unapply be called")
    Some(math.sqrt(z))
  }
  def apply(z: Double): Double = z * z
}

