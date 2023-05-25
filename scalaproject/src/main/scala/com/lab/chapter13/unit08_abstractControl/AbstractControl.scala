package com.lab.chapter13.unit08_abstractControl

/**
  * Created by 17081290 on 2020/7/6.
  * 清单 13.8.1
  *
  */
object AbstractControl {
  def main(args: Array[String]) {
    def myRunInThread(f1:()=>Unit)={
      new Thread{
        override def run(): Unit ={
          f1()
        }
      }.start()
    }


    myRunInThread{
      ()=>
        println("doing ! 5s")
        Thread.sleep(5000)
        println("done")
    }

    //没有输入输出的函数的使用--简化形式
    def myRunInThread2(f1: =>Unit): Unit ={
      new Thread{
        override def run():Unit={
          f1
        }
      }.start()
    }

   //没有输入输出的函数的使用
    myRunInThread2{
      println("doing ha ha! 5s")
      Thread.sleep(5000)
      println("done")
    }


  }

}
