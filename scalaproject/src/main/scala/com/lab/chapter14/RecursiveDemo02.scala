package com.lab.chapter14

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by 17081290 on 2020/7/6.
  */
object RecursiveDemo02 {
  def main(args: Array[String]) {
    val now:Date = new Date()
    val dataFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dataFormat.format(now)
    println("the begin date = "+date)

    def mx(num:BigInt,sum:BigInt):BigInt={
      if(num < 99999999l) return mx(num+1,sum+num)
      else return sum
    }

    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num,sum)

    println("res = "+res)
    val End:Date = new Date()
    val endDate = dataFormat.format(End)
    println("the end date = "+endDate)



  }











}
