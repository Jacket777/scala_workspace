package com.edu.sparkCore

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @author Jack
 */
object WordCountA {
  def main(args : Array[String]) {
    val inputFile =  "file:///usr/test/spark/RDD/word.txt"
    val conf = new SparkConf().setAppName("WordCountTest")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(inputFile,2).cache()
    val numAs = textFile.filter(line => line.contains("a")).count()
    val numBs = textFile.filter(line => line.contains("b")).count()
    println("Lines with a:%s,Lines with b:%s".format(numAs,numBs))   
  }
}
