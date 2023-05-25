package com.lab.chapter03.arith

/**
  * 清单3.2. 练习
  */
object Exericse01 {
  def main(args: Array[String]) {
    val days = 97
    printf("统计结果是 %d 个星期零 %d 天",days / 7,days % 7)

    val huashi = 232.5
    val sheshi = 5.0 /9 *(huashi - 100)
    println("对应的摄氏温度 "+sheshi.formatted("%.2f"))

  }

}
