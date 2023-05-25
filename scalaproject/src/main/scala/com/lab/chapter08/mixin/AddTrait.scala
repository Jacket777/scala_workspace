package com.lab.chapter08.mixin

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.8
  * 叠加特质--构建顺序与方法执行顺序
  */
object AddTrait {
  def main(args: Array[String]) {
    //说明
    //1. 创建MySQL5实例时，动态的混入DB4和File4
    //问题1：创建一个动态混入对象时，其顺序时怎样的
    //scala在叠加特质时，会首先从后面的特质开始执行[从左到右]
    val mysql = new MySQL5 with DB4 with File4
    println(mysql)  //1.Operate4 --->2.Data4--->3.DB4---->4.File4

    //问题2.当执行一个动态混入对象的方法，其执行顺序时是怎样的
    //顺序是 1.从右到左开始执行，
    //2.当执行到super时，是指的左边的特质
    //3.如果左边没有特质了，则super是父特质
    mysql.insert(100)
    println("=================")

    val test5 = new TESTMYSQL5
    test5.insert(200)

  }

}

trait Operate4{
  println("Operate4.....")
  def insert(id:Int)  //抽象方法
}

trait Data4 extends Operate4{ //特质 继承了Operate4
  println("Data4.....")
  override def insert(id:Int): Unit ={  //实现Operate4的insert
    println("插入数据 = "+id)
  }
}

trait DB4 extends Data4{
  println("DB4.....")

  override def insert(id:Int): Unit ={  //重写Data4的insert
    println("向数据库 ")
    super.insert(id)
  }
}


trait File4 extends Data4{
  println("File4.....")

  override def insert(id:Int): Unit ={  //重写Data4的insert
    println("向文件 ")
    super.insert(id)  //调用了insert方法，这里super动态混入时，不一定是父类
  }

}

class MySQL5{

}

class TESTMYSQL5 extends DB4 with File4{

}
