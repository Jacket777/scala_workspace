package com.edu.sparkStreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext

/*
 * 1.文件流监控：对目标文件目录进行监控，每隔两秒统计文件中的单词量
 */


object WordCountStreaming {
  def main(args:Array[String]){
    val sparkConf = new SparkConf().setAppName("WordCountStreaming").setMaster("local[2]")
    //set application name :WordCountStreaming
    //set run mode:local
    //set the threads: two thread,one for mointor,one for process
    val ssc = new StreamingContext(sparkConf,Seconds(2))//time intermediate 2 seconds
    
    val lines = ssc.textFileStream("hdfs://192.168.150.130:9000/Spark/Streaming/logfile")
    val words = lines.flatMap(_.split(""))
    val wordCounts = words.map(x=>(x,1)).reduceByKey(_+_)
    println("AAAAAA")
    wordCounts.print()
    ssc.start()
    ssc.awaitTermination()
  }
}