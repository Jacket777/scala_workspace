package com.edu.sparkStreaming

import org.apache.spark.rdd.RDD
import org.apache.spark.SparkConf
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.Seconds
import scala.collection.mutable.SynchronizedQueue

/*
 * RDD队列流
 */

object QueueStream {
  def main(args:Array[String]){
    val sparkConf = new SparkConf().setAppName("TestRDDQueue").setMaster("local[2]")
    val ssc = new StreamingContext(sparkConf,Seconds(2))
    val rddQueue = new SynchronizedQueue[RDD[Int]]()
    val queueStream = ssc.queueStream(rddQueue)
    val mappedStream = queueStream.map(r=>(r%10,1))
    val reducedStream = mappedStream.reduceByKey(_+_)
    reducedStream.print()
    ssc.start()
    for(i<- 1 to 10){
      rddQueue += ssc.sparkContext.makeRDD(1 to 100,2)
      Thread.sleep(1000)
    }
    ssc.stop()
    
  }
  
}