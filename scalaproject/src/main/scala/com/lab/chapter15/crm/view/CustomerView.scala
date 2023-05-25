package com.lab.chapter15.crm.view

import com.lab.chapter15.crm.bean.Customer
import com.lab.chapter15.crm.service.CustomerService

import scala.io.StdIn

/**
  * Created by 17081290 on 2020/7/8.
  */
class CustomerView {
  var customerService = new CustomerService

  def mainMen(): Unit ={
    //定义一个循环变量，控制循环是否退出
    var loop = true
    //用于接收用户输入的选项
    var key =' '
    //

    do{

      println("-----------------客户信息管理软件-----------------")
      println("                  1 添 加 客 户                  ")
      println("                  2 修 改 客 户                  ")
      println("                  3 删 除 客 户                  ")
      println("                  4 客 户 列 表                  ")
      println("                  5 退      出                  ")
      println("                  请选择(1-5)：                  ")
      key = StdIn.readChar()
      key match{
        case '1' => println("1 添 加 客 户")
        case '2' => println("2 修 改 客 户")
        case '3' => println("3 删 除 客 户")
        case '4' => {println("4 客 户 列 表"); this.list()}
        case '5' => loop =false
      }
    }while(loop)
    println(" 你已经退出程序 ")
  }


 //显示所有客户
  def list(): Unit ={
    println("---------------------------客户列表---------------------------")
    val customers = customerService.list()
    for(customer <- customers){
      println(customer)
    }
    println("-------------------------客户列表完成-------------------------")
  }


  //添加客户
  def add(): Unit ={
    println("---------------------------添加客户---------------------------")
    println("姓名: ")
    val name = StdIn.readLine()
    println("性别: ")
    val gender = StdIn.readChar()
    println("年龄: ")
    val age = StdIn.readShort()
    println("电话: ")
    val tel = StdIn.readLine()
    println("邮箱: ")
    val email = StdIn.readLine()
    //构建对象
    val customer= new Customer(name,gender,age,tel,email)
    customerService.add(customer)
    println("----------添加完成----------------")

  }


  /**
    * 删除
    */
  def del(): Unit ={
    println("---------------------删除客户---------------------")
    println("请选择待删除客户编号(-1退出)：")
    val id = StdIn.readInt()
    if(id == -1){
      println("---------------------删除没有完成----------------")
      return
    }
    println("确认是否删除(Y/N)：")
    val choice = StdIn.readChar().toLower
    if(choice == 'y'){
      if(customerService.del(id)){
        println("---------------------删除没有完成----------------")
        return
      }
    }
    println("-------删除没有完成--------")

  }













}
