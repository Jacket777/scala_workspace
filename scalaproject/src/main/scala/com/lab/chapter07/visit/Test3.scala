package com.lab.chapter07.visit

/**
  * Created by 17081290 on 2020/6/8.
  * 引入包的细节和注意事项
  *1.import 语句可以出现在任何地方，好处在需要时引入包，缩小import包的作用范围，提高效率
  *2.引入所有包，java中使用通配符*,scala中采用_
  *3.如果不想某个包中全部的类，而是其中几个类，可以采用选取器
  *4.如果引入的多个包中含有相同的类，那么可以将不需要的类进行重命名进行区分，这给就是重命名
  *5.如果某个冲突的类根本就不会用到，那么这个类可以直接隐藏掉
  */
object Test3 {

  def test():Unit={
    //可以使用选择器，选择引入包的内容
    import scala.collection.mutable.{HashMap,HashSet}
    var map = new HashMap
    var set = new HashSet
  }


  def test2():Unit={
    //下面的含义是将java.util.HashMap重命名JavaHashMap
    import java.util.{HashMap=>JavaHashMap,List}
    import scala.collection.mutable._
    var map = new HashMap        //此时的HashMap指向的是scala中的HashMap
    var map1 = new JavaHashMap() //此时使用的java中hashMap的别名
  }


  def test3():Unit={
    import java.util.{HashMap=>_,_} // 含义为引入java.util包中所有类，但是忽视HashMap类
    import scala.collection.mutable._
    var map = new HashMap()  //此时的HashMap指向的是scala中的HashMap，而且idea工具的提示夜不会显示java.util.HashMap
  }


}



class User{
  import scala.beans.BeanProperty
  @BeanProperty var name:String="" //缩小import包中作用范围
}

class Dog{
  // @BeanProperty var name:String="" //错误，不可以
}


