package com.edu.sparkRDD

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.HashPartitioner

object FileSort {
  def main(args:Array[String]):Unit={
    val conf = new SparkConf().setAppName("FileSort")
    val sc = new SparkContext(conf)
    val dataFile = "file:///usr/local/spark/data"
    val lines = sc.textFile(dataFile,3)
    var index = 0
    val newLines = lines.filter(_.trim().length()>0)
    val newMap01 = newLines.map(n=>(n.trim.toInt,""))
    val newMap02 = newMap01.partitionBy(new HashPartitioner(1)).sortByKey()
    val result = newMap02.map(t=>{
      index +=1
      (index,t._1)
    })
    result.saveAsTextFile("file:///usr/local/result")
  } 
}