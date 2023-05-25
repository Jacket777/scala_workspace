package com.lab.chapter11.unit08_iterator

/**
  * Created by 17081290 on 2020/6/28.
  */
object IteratorDemo01 {
  def main(args: Array[String]) {
    val iterator = List(1, 2, 3, 4, 5).iterator // 得到迭代器
    println("--------遍历方式1 -----------------")

    /**
      *  def iterator: Iterator[A] = new AbstractIterator[A] {
    var these = self
    def hasNext: Boolean = !these.isEmpty
    def next(): A =
      if (hasNext) {
        val result = these.head; these = these.tail; result
      } else Iterator.empty.next()
      */
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("--------遍历方式2 for -----------------")
    for(enum <- iterator) {
      println(enum) //
    }

  }

}
