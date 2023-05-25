package com.edu.sparkCore

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
 
object WordCount {
    def main(args: Array[String]) {
        val conf = new SparkConf().setMaster("local").setAppName("WordCount")
        val sc = new SparkContext(conf)//ctr + alt + o
        val textFile = sc.textFile("e://hello.txt",1)
        val wordCount = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
        wordCount.foreach(println)       
    }
}