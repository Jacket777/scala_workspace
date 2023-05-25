package com.lab.chapter17.unit10_rmi

import java.rmi.{RemoteException, Remote}

/**
  * Created by 17081290 on 2020/7/16.
  */
trait MyRemote extends Remote {
  //一个抽象方法
  @throws(classOf[RemoteException])
  def sayHello(): String //throws RemoteException
}

