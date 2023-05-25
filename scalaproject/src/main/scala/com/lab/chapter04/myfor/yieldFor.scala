package com.lab.chapter04.myfor

/**
  * 清单4.20 循环返回值与yield的使用
  */
object yieldFor {
  def main(args: Array[String]) {
    //1.yield将每次循环得到i放入集合Vector中，并返回给res
    //2. i这里是代码块，这意味着可以对i进行处理
    //3.体现scala的重要语法特点，将一个集合中各个数据进行处理，并返回给新的集合
    val res = for(i <- 1 to 10) yield i
    println(res)

    val result = for(j<- 1 to 10) yield {
      if(j%2 == 0){
        j
      }else{
        "不是偶数"
      }
    }
    println(result)

  }

}
