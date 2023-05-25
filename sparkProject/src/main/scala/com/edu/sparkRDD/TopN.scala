package com.edu.sparkRDD

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/*
 * 求前5个最大的值
 */


object TopN {
  def main(args:Array[String]):Unit={
    val conf = new SparkConf().setAppName("TopN").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val lines = sc.textFile("hdfs://192.168.150.130:9000/usr",2)
    var num = 0
    val newLines = lines.filter(line => (line.trim().length()>0)&&(line.split(",").length==4))
    val newMap01 = newLines.map(_.split(",")(2))
    val newMap02 = newMap01.map(x =>(x.toInt,"")).sortByKey(false)
    val newMap03 = newMap02.map(x => x._1).take(5)
    newMap03.foreach(x=>{
      num = num + 1
      println(num+"\t"+x)
      })  
  } 
}