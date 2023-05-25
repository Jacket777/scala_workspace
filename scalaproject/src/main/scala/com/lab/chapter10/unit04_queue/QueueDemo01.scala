package com.lab.chapter10.unit04_queue
import scala.collection.mutable

/**
  * Created by 17081290 on 2020/6/10.
  * 清单10.4.1
  */
object QueueDemo01 {
  def main(args: Array[String]) {
     //1.创建队列
     val q1 = new mutable.Queue[Any]

     println(q1)
    //2.新增元素
     q1 += 9
    println(" q1 = "+q1)
    q1 ++= List(4,5,7)  //默认加在队列的后面
    println(" q1 = "+ q1)
    q1 += List(70,90)  //只有Any类型才可以,list作为一个整体放在其中
    println(" q1 = "+ q1)
    //3.出队操作，q1本身会变化
    val queueElement = q1.dequeue()
    println(" queueElement = "+queueElement+" q1 = "+q1) // queueElement = 9 q1 = Queue(4, 5, 7)
    //4.入队操作。默认从队列尾巴加入
    q1.enqueue(100,10,100,888)
    println(" q1 = "+q1) //q1 = Queue(4, 5, 7, 100, 10, 100, 888)

    println("===============Queue 返回队列的元素===========")
    //1.获取队列的第一个元素
    println(q1.head)//4
    //2.获取队列的最后一个元素
    println(q1.last) //888
    //3.取出队尾的元素，即返回除第一以外剩余的元素，可以级联使用
    println(q1.tail)   //Queue(5, 7, 100, 10, 100, 888)
    println(q1.tail.tail)   //Queue(5, 7, 100, 10, 100, 888)
    println(q1.tail.tail.tail)   //Queue(5, 7, 100, 10, 100, 888)
    println(q1.tail.tail.tail.tail) //Queue(10, 100, 888)




  }

}
