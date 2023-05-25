package com.lab.chapter07.abstractdemo

/**
  * Created by 17081290 on 2020/6/8.
  * 面向对象编程方法--抽象
  */
object BankDemo {
  def main(args: Array[String]) {
    val account = new Account("te0001",89.3,"1111");
    account.query("1111")
    account.withDraw("1111",10.0)
    account.query("1111")

  }

}


//编写一个Account
class Account(inAccount:String,inBalance:Double,inPwd:String){
  /**
    * 属性：账号，余额，密码
    * 方法:查询，取款，存款
    */
  var accountNo = inAccount
  var balance = inBalance
  var pwd = inPwd

  //查询
  def query(pwd:String):Unit={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    printf("账号为 %s , 当前余额为 %.2f\n", this.accountNo,this.balance)
  }



 //取款
  def withDraw(pwd:String,money:Double):Any={
   if(!this.pwd.equals(pwd)){
     println("密码错误")
     return
   }

   //判断money是否合理
   if(this.balance < money){
     println("余额不足")
     return
   }

   this.balance -= money
   money
 }



}