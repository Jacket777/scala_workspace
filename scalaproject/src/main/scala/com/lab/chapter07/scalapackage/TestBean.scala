package com.lab.chapter07.scalapackage
import scala.beans.BeanProperty


/**
  * Created by 17081290 on 2020/6/8.
  * 引入包的方式
  *
  */

class Manager(var name:String){
  //第一种形式 [使用相对路径引入包]
  @BeanProperty var age:Int=_;
  //第二种形式 [使用相对路径引入包]
  @scala.beans.BeanProperty var age2:Int=_;
  //第三种形式 [使用绝对路径引入包] 可以解决包名冲突
  @_root_.scala.beans.BeanProperty var age3:Int=_;


}
object TestBean {
  def main(args: Array[String]) {
    val m = new Manager("Jack")
    println("m = "+m )
  }
}
