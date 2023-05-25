package com.lab.chapter15.crm.service

import com.lab.chapter15.crm.bean.Customer
import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

/**
  * Created by 17081290 on 2020/7/8.
  */
class CustomerService {
  val customers = ArrayBuffer(new Customer(1,"tom",'男',10,"110","tom@163.com"))
  var customerNum = 1

  def list():ArrayBuffer[Customer]={
   this.customers
  }

  //添加客户
  def add(customer: Customer):Boolean ={
    customerNum += 1
    customer.id = customerNum
    customers.append(customer)
    true
  }


  //根据id找到index
  def findIndexById(id:Int)={
    var index = -1
    breakable{
      for(i<- 0 until customers.length){
        if(customers(i).id == id){
          //找到了
          index = i
          break()
        }
      }
    }
    index
  }

  //根据id删除
  def del(id:Int):Boolean={
    val index = findIndexById(id)
    if(index != -1){
      customers.remove(index)
      true
    }else{
      false
    }
  }


}
