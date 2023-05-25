package com.lab.chapter05.recursive

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.2.4
  *题3：猴子吃桃子问题有一堆桃子，猴子第一天吃了其中的一半，
  * 并再多吃了一个！以后每天猴子都吃其中的一半，
  * 然后再多吃一个。当到第十天时，
  * 想再吃时（还没吃），发现只有1个桃子了。
  * 问题：最初共多少个桃子？
  */
object Exercise03 {
  def main(args: Array[String]) {
    val res01 = peach(5)
    println("res01 = "+res01)

  }

   def peach(n:Int):Int={
     if(n==10 ){
       1
     }else{
       (peach(n+1)+1)*2
     }
   }
}
