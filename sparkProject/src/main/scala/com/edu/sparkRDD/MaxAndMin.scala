package com.edu.sparkRDD

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
/*
 * 求最大值与最小值
 */

object MaxAndMin {
  def main(args:Array[String]):Unit={
    val conf = new SparkConf().setAppName("MaxAndMin").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val lines = sc.textFile("hdfs://192.168.150.130:9000/usr",2)
    val newLines = lines.filter(_.trim().length>0)
    val newMap01 = newLines.map(line =>("key",line.trim.toInt)).groupByKey()
    val newMap02 = newMap01.map(x =>{
      var min = Integer.MAX_VALUE
      var max = Integer.MIN_VALUE
      for(num <- x._2){
        if(num > max){
          max = num
        }
        if(num < min){
          min = num
        }
      }
      (max,min) 
    })
   val result = newMap02.collect().foreach(x=>{
     println("max\t"+x._1)
     println("min\t"+x._2)
   })    
  } 
}