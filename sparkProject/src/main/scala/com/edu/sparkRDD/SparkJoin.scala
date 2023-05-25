package com.edu.sparkRDD

import org.apache.spark._
import SparkContext._

object SparkJoin {
  def main(args:Array[String]):Unit={
    if(args.length!=3){
      println("Usage is SparkJoin<rating><movie><output>")
      return
    }
    val conf = new SparkConf().setAppName("SparkJoin").setMaster("local")
    val sc = new SparkContext(conf)
    //Reading rating from HDFS file
    val textFile = sc.textFile(args(0))
    //Extract (movieid,rating)
    val rating = textFile.map(
        line =>{
         val fields = line.split("::")
         (fields(1).toInt,fields(2).toDouble)
        }
       )
       
    //Get(movieid,ave_rating)
    val scores = rating.groupByKey()
    val movieScores = scores.map(data =>{
       val avg = data._2.sum/data._2.size
       (data._1,avg)
    })
    
    //Read movie from HDFS file
    val movies = sc.textFile(args(1))
    val moviesMap = movies.map(line =>{
    val fields = line.split("::")
      (fields(0).toInt,fields(1))//(movieID,movieName
    })
    val movieskey = moviesMap.keyBy(tup=>tup._1)
    
    //by Join we get [movie,averageRating,movieName>
    val result = movieScores.keyBy(tup=>tup._1).join(movieskey).filter(f=>f._2._1._2>4.0).map(
        f=>(f._1,f._2._1._2,f._2._2._2))
    result.saveAsTextFile(args(2) )  
  }
}