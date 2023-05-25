package com.edu.sparkStreaming

import org.apache.spark.internal.Logging
import org.apache.log4j.Level
import org.apache.log4j.Logger


object StreamingExample {
  
  def setStreamingLogLevels(){
    val log4jInitialized = Logger.getRootLogger.getAllAppenders.hasMoreElements()

    if(!log4jInitialized){
      
    }
    
  }
  
  
}