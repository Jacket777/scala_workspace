package com.edu.sparkCore

import org.apache.spark.{SparkContext,SparkConf}
import org.json4s._
import org.json4s.jackson.JsonMethods._

object Test {
      def main(args: Array[String]) {
        val conf = new SparkConf().setAppName("ABC")
        val sc = new SparkContext(conf)//ctr + alt + o
        sc.hadoopConfiguration.set("mapreduce.output.fileoutputformat.compress",
          "false");
        val file="FILE DIR";
        val rdd = sc.textFile(file);
       // 11.11
       rdd.map { line =>
       val st = parse(line).asInstanceOf[JObject].obj.toMap.get("st").
         get.asInstanceOf[JString].s.toLong
     (st, line)
       }.filter(tuple => tuple._1 >= 1573401600000L).map(_._2).saveAsTextFile("/user/bi/ssa/ssa_sdk_click_log_20191111")

      // 11.10
     rdd.map { line =>
      val st = parse(line).asInstanceOf[JObject].obj.toMap.get("st").get.asInstanceOf[JString].s.toLong
  (st, line)
  }.filter(tuple => tuple._1 < 1573401600000L).map(_._2).saveAsTextFile("/user/bi/ssa/ssa_sdk_click_log_20191110") 
    }
  
}