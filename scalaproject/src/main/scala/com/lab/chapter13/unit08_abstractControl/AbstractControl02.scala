package com.lab.chapter13.unit08_abstractControl

/**
  * Created by 17081290 on 2020/7/6.
  * 清单 13.8.2
  * 抽象控制 高阶用法
  * 实现类似 while unit用法
  *
  */
object AbstractControl02 {
  def main(args: Array[String]) {
    var x = 10
    def unit(condition: =>Boolean)(block: =>Unit):Unit={
      //类似while循环 递归
      if(condition){
        block
        //递归调用unitl
        unit(condition)(block)
      }

    }
    unit(x >0){
      x-=1
      println("unit x="+x)
    }

  }

}
