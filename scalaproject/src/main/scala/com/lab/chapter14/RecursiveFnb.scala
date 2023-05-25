package com.lab.chapter14

/**
  * Created by 17081290 on 2020/7/7.
  */
object RecursiveFnb {
  def main(args: Array[String]) {
    var count = BigInt(0)
    println(fbn(3))
    println("递归调用的次数是 "+count)


    def fbn(n:BigInt):BigInt={
      count += 1

      if(n ==1 || n == 2){
        return 1
      }else{
        fbn(n-1)+fbn(n-2)
      }
    }
  }

}
