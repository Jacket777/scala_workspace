package com.lab.chapter05.fundetails

/**
  * Created by 17081290 on 2020/6/1.
  * 清单 5.3.7
  * 函数注意事项和细节讨论
  * (11).scala 函数的形参默认是val的，因此不能在函数中进行修改.
  * (12).递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型
  */
object Details06 {
  def main(args: Array[String]) {

   println(f8(8))

  }



  def f8(n:Int):Int={
    if(n<=0){
      1
    }else{
      n*f8(n-1)
    }
  }

}
