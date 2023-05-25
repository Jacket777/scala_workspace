package com.lab.chapter08

/**
  * Created by 17081290 on 2020/6/9.
  * 清单 8.2.
  * 小孩加入游戏演示
  */
object ChildJoinGame {
  def main(args: Array[String]) {
    val child1 = new Child02("Jack")
    val child2 = new Child02("tom")
    val child3 = new Child02("Jerry")
    Child02.joinGame(child1)
    Child02.joinGame(child2)
    Child02.joinGame(child3)
    Child02.showNum()


  }

}


class Child02(cName:String){
  var name = cName
}

object Child02 {
  //统计共有多少小孩的属性
  var totalChildNum = 0

  def joinGame(child:Child02): Unit ={
    printf("%s 小孩加入游戏\n",child.name)
    totalChildNum += 1
  }

  def showNum(): Unit ={
    printf("当前有 %d 小孩玩游戏\n",totalChildNum)
  }
}