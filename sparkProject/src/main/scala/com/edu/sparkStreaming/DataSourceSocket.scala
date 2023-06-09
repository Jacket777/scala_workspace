package com.edu.sparkStreaming

import java.io.PrintWriter
import java.net.ServerSocket
import java.util.Random
import scala.io.Source


/*
 * 自定义套接字流
 */
object DataSourceSocket {
  def index(length:Int)={
    var rdm = new Random()
    rdm.nextInt(length)
  }
  
  def main(args:Array[String]){
    if(args.length!=3){
      System.err.println("Usage: <filename> <port> <millisecond>")
      System.exit(1)
    }
    val fileName = args(0)
    val lines = Source.fromFile(fileName).getLines().toList
    val rowCount = lines.length
    val listener = new ServerSocket(args(1).toInt)
    
    while(true){
      val socket = listener.accept()
      new Thread(){
        override def run={
          println("Got client connected from: "+socket.getInetAddress)
          val out = new PrintWriter(socket.getOutputStream(),true)
          
          while(true){
            Thread.sleep(args(2).toLong)
            val content = lines(index(rowCount))
            println(content)
            out.write(content+"\n")
            out.flush()
          }
          socket.close()   
        }
      }.start()
    }
  }
}