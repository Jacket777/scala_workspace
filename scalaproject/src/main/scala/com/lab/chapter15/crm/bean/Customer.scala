package com.lab.chapter15.crm.bean

/**
  * Created by 17081290 on 2020/7/6.
  */
class Customer {
  var id:Int = _
  var name:String = _
  var gender:Char = _
  var age:Short = _
  var tel:String = _
  var email:String= _

  def this(id:Int,name:String,gender:Char,age:Short,tel:String,email:String){
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.email = email
  }


  def this(name:String,gender:Char,age:Short,tel:String,email:String){
    this
    this.name = name
    this.gender = gender
    this.age = age
    this.email = email
  }

  override
  def toString(): String ={
    this.id+"\t\t"+this.name+"\t\t"+this.gender+"\t\t"+this.age+"\t\t"+this.tel+"\t\t"+this.email
  }

}
