package com.edu.sparkCore

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object TransformationOperation {
  def filter(){
    val conf = new SparkConf().setMaster("local").setAppName("filter")
    val sc = new SparkContext(conf)
    val number = Array(1,2,3,4,5)
    val numberRDD = sc.parallelize(number,1)
    numberRDD.filter(num => num%2==0).foreach(x=>println(x)) 
  }
  
  def map(){
    val conf = new SparkConf().setMaster("local").setAppName("MAP")
    val sc = new SparkContext(conf)
    val names = Array("Jack","Tom","Marry")
    val nameRDD = sc.parallelize(names)
    nameRDD.map(name=>"hello "+name).foreach(name=>println(name))  
  }
  
  
  def flatMap(){
    val conf = new SparkConf().setMaster("local").setAppName("flatMAP")
    val sc = new SparkContext(conf)
    val word = Array("you	jump","i	jump")
    val wordRDD = sc.parallelize(word)
    wordRDD.flatMap(x=>x.split("\t")).foreach(x=>println(x))  
  }
  
  
  def groupBykey(){
    val conf = new SparkConf().setMaster("local").setAppName("groupBykey")
    val sc = new SparkContext(conf)
    val names = Array(
        Tuple2("USA","Tom"),
        Tuple2("USA","Tim"),
        Tuple2("CHN","Jack"),
        Tuple2("CHN","XP"),
        Tuple2("JP","A"),
        Tuple2("JP","B"))
    val namesRDD = sc.parallelize(names,1) 
    namesRDD.groupByKey(1).foreach(
    result=>{println("National:"+result._1); result._2.foreach(name=>print(name+" "))
    println("")}  
    ) 
  }
  
  
   def reduceByKey(){
    val conf = new SparkConf().setMaster("local").setAppName("reduceByKey")
    val sc = new SparkContext(conf)
    val names = Array(
        Tuple2("USA",30),
        Tuple2("CHN",20),
        Tuple2("USA",30),
        Tuple2("CHN",10)    
    );
    val namesRDD = sc.parallelize(names, 1)
    namesRDD.reduceByKey(_+_).foreach(result=>println(result._1+" 得分:"+result._2)) 
  }
   
  
   def sortByKey(){
    val conf = new SparkConf().setMaster("local").setAppName("reduceByKey")
    val sc = new SparkContext(conf)
    val names = Array(
        Tuple2(30,"USA"),
        Tuple2(20,"CHN"),
        Tuple2(40,"JP"),
        Tuple2(60,"UK") 
        );    
    val namesRDD = sc.parallelize(names, 1)
    namesRDD.sortByKey(false, 1).foreach(result=>println(result._2+":分数："+result._1)) 
   }
   
   
   def join(){
     val conf = new SparkConf().setMaster("local").setAppName("join")
     val sc = new SparkContext(conf)
     val name = Array(Tuple2(1,"Jack"),Tuple2(2,"Tom"))
     val score = Array(Tuple2(1,90),Tuple2(2,60))
     val nameRDD = sc.parallelize(name, 1)
     val scoreRDD = sc.parallelize(score,1)
     nameRDD.join(scoreRDD).foreach(result=>println("学号:"+result._1+" 姓名"+result._2._1+" 分数"+result._2._1))
   }
   
   
   def cogroup(){
     val conf = new SparkConf().setMaster("local").setAppName("join")
     val sc = new SparkContext(conf)
     val name = Array(Tuple2(1,"Jack"),Tuple2(2,"Tom"))
     val score = Array(Tuple2(1,90),Tuple2(2,60),Tuple2(1,850),Tuple2(2,605))
     val nameRDD = sc.parallelize(name, 1)
     val scoreRDD = sc.parallelize(score,1)
     //def foreach(f: ((Int, (Iterable[String], Iterable[Int]))) => Unit): Unit
     nameRDD.cogroup(scoreRDD).foreach(result=>{
       println(result._1)
       result._2._1.foreach(x=>println(x))
       result._2._2.foreach(y=>println(y))
     }
       )
   }
  
   
   def intersection(){
     val conf = new SparkConf().setMaster("local").setAppName("join")
     val sc = new SparkContext(conf)
     val lista = Array(1,2,3,4)
     val listb = Array(4,5,6,7)
     val listaRDD = sc.parallelize(lista)
     val listbRDD = sc.parallelize(listb)
     listaRDD.intersection(listbRDD)
     .foreach{x=>println(x)}
   }
   
   def union(){
     val conf = new SparkConf().setMaster("local").setAppName("join")
     val sc = new SparkContext(conf)
     val lista = Array(1,2,3,4)
     val listb = Array(4,5,6,7)
     val listaRDD = sc.parallelize(lista)
     val listbRDD = sc.parallelize(listb)
     listaRDD.union(listbRDD)
     .foreach{x=>println(x)}
     
   }
   
  
  
  
  
  
  
  
  
  def main(args:Array[String]):Unit={
    //filter()
    //map()
    //flatMap()
    //groupBykey()
    //reduceByKey()
    //sortByKey()
    //join()
    //cogroup()
    //intersection()
    union()
    
  }
  
}