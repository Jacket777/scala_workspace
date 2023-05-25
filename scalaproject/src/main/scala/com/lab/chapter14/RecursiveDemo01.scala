package com.lab.chapter14

import java.util.Date
import java.text.SimpleDateFormat

/**
  * Created by 17081290 on 2020/7/6.
  *
  */
object RecursiveDemo01 {
  def main(args: Array[String]) {
    val now:Date = new Date()
    val dataFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dataFormat.format(now)
    println("the begin date = "+date)

    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(999999991)
    while(num <= maxVal){
      res += num
      num += 1
    }
    println("res = "+res)
    val End:Date = new Date()
    val endDate = dataFormat.format(End)
    println("the end date = "+endDate)






  }

}
