package com.lab.chapter10.unit05_map

import scala.collection.mutable

/**
  * Created by 17081290 on 2020/6/10.
  * 不可变Map 演示
  * 说明：
  * 1.默认Map为immutable.map
  * 2.key-value类型支持Any
  * 3.在Map的底层，每队key-value是Tuple2
  * 4.输出顺序和声明顺序一致
  *
  */
object MapDemo01 {
  def main(args: Array[String]) {
    /**
      * part-1 创建map四种方式
      */
    println("-----------1.创建map--------------------")
    val map1 = Map("Alice"->10,"Bob"-> 20,"Kotlin"->"Beijing")
    println("map1 = "+map1)

    //方式2---可变的输出与声明不一致
    val map2 = mutable.Map("Alice"->10,"Bob"-> 20,"Kotlin"->"Beijing")
    println("map2 = "+map2)

    //方式3---创建空的映射射
    val map3 = new scala.collection.mutable.HashMap[String,Int]
    println("map3 = "+map3)

    //方式4---对偶元组
    val map4 = mutable.Map(("Alice",10),("Bob",20),("Kotlin","Beijing"))
    println("map4 = "+map4)

    /**
      * part-2 元组取值的四种方式
      */
    //方式1---使用map(key)
    /**
      * 说明
      * 1.如果key存在，则返回对应的值
        2.如果key不存在，则抛出异常[java.util.NoSuchElementException]
        在Java中,如果key不存在则返回null
      */
    println("-----------2.map取值--------------------")
    val value1 = map2("Alice")
    println(value1)
    println(map4("Alice"))
    //抛出异常
    //println(map4("Alice~"))



    //方式2---使用contains方法检查是否存在key
    /**
      * 说明：
      * // 返回Boolean
        // 1.如果key存在，则返回true
        // 2.如果key不存在，则返回false
      */
    if(map4.contains("Alice")){
      println(" the key exist, value = "+map4("Alice"))
    }else{
      println(" the key is not exist")
    }

    //方式3---使用map.get(key).get取值
    /**
      * 通过 映射.get(键) 这样的调用返回一个Option对象，要么是Some，要么是None
      */
    println(map4.get("Alice").get)
    println(map4.get("Alice"))


    //方式4---使用map4.getOrElse()取值
    /**
      * 如果key存在，返回key对应的值。
        如果key不存在，返回默认值。在java中底层有很多类似的操作。
      */
   println(map4.getOrElse("Alice-----","default"))
    println(map4.getOrElse("Alice","default"))


    /**
      * part 3--更新map元素
      * map 是可变的，才能修改，否则报错
        如果key存在：则修改对应的值,key不存在,等价于添加一个key-val
      */
    println("-------3.更新元素-----------")
    val map5 = mutable.Map(("A",1),("B","Beijing"),("C",3))
    map5("A") = 20
    map5("D") = 100
    println(" map5 = "+map5)

    /**
      * part 4--增加map元素
      *
      */
    println("-------4.增加元素-----------")
    val map7 = mutable.Map(("A",1),("B","Beijing"),("C",3))
    //方式1--增加单个元素
    map7 +=("D"->4)
    map7+=("B"->50)
    println("after add map7 "+ map7)
    //方式2--增加多个元素
    val map8 = map7+("E"->4,"F"->3)
    map7 +=("E"->4,"F"->3)
    println("after add map7 "+map7)


    /**
      * part 4--删除map元素
      *说明
      "A","B" 就是要删除的key, 可以写多个.
      如果key存在，就删除，如果key不存在，也不会报错.
      */
    println("-------5.删除元素-----------")
    val map9 = mutable.Map(("A",1),("B","Beijing"),("C",3))
    map9 -=("A","B","AAA")
    println("map5 = "+map9)


    /**
      * part 5--遍历map元素
      *说明
      遍历方式有4种
      */
    println("-------6.遍历元素-----------")
    val map6 = mutable.Map(("A",1),("B","Beijing"),("C",3))
    //方式1--- key value 遍历
    println("-------(k,v)<- map6-----------")
    for((k,v)<-map6)println(k+" is mapped to "+v)
    //方式2---key  遍历
    println("-------v<- map6.keys-----------")
    for(v<-map6.keys)println(v)
    //方式3--- value 遍历
    println("-------v<- map6.values-----------")
    for(v<-map6.values) println(v)
    //方式4--- v 遍历 v类型是Tuple2
    println("-------v<- map6-----------")
    for(v<-map6)println(v)
    for(v<-map6)println(v+" key = "+v._1+" val="+v._2)

  }

}
