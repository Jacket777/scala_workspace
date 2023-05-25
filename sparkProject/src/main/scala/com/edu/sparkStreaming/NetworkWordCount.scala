package com.edu.sparkStreaming

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.Seconds

/*
 * 2.网络套接字流监控
 */

object NetworkWordCount {
  def main(args:Array[String]){
    if(args.length <2){
      System.err.println("Usage:NetworkWordCount<hostname><port>")
      System.exit(1)
    }
    
    val sparkConf = new SparkConf().setAppName("NetworkCount").setMaster("local[2]")
    val ssc = new StreamingContext(sparkConf,Seconds(1))
    val lines = ssc.socketTextStream(args(0), args(1).toInt, StorageLevel.MEMORY_AND_DISK)
    val words = lines.flatMap(_.split(" "))
    val wordCounts = words.map(x=>(x,1)).reduceByKey(_+_)
    wordCounts.print()
    ssc.start()
    ssc.awaitTermination()  
  } 
}