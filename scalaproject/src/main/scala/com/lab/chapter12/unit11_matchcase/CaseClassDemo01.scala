package com.lab.chapter12.unit11_matchcase

/**
  * Created by 17081290 on 2020/6/29.
  * 清单12.11.1
  * 样例类
  */
object CaseClassDemo01 {
  def main(args: Array[String]) {
     println("==============")
  }

}

/**
  * 这里的 Dollar，Currencry, NoAmount  是样例类
  *
  * 类型（对象）=>序列化=>字符
  */
abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object NoAmount extends Amount
