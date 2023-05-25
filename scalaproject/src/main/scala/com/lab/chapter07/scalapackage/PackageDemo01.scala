
/**
  * Scala包注意事项
  * 1.package com.edu{}，表示创建了包com.edu,在{}中
  * 2.可以继承写它的子包 com.edu.sacal ,还可以写类，特质，object
  * 3.一个文件中，可以同时创建多个包，以及给各个包创建类，trait和object
  * 4.作用域： 可以直接向上访问：Scala中子包中直接访问父包中的内容，大括号体现作用域，
  * 在自包和父包中类重名时，默认采取就近原则，如果希望指定使用某个类，则待上包名
  * 5.父包要访问子包的内容时，需要import对应的类
  *
  */




package com.edu{ //包com.edu

  class User{ //在com.edu包下创建User类


    def sayHello(): Unit ={
      //使用子包中的monster
      import com.edu.scala2   .Monster
      val monster = new Monster()
    }

  }

  package scala2{ //创建包 com.edu.scala2
    class User{ //在 com.edu.scala2包下创建User类

    }


    class Monster{

    }
  }


  package scala{

    import com.edu

    // 包

    class Person{ //在包com.edu.scala下创建类Person
      val name = "Nick"

      def play(message:String):Unit={
        println(this.name +" "+message)
      }
    }

    class User{

    }


    object PackageDemo01 {//在包下创建object
    def main(args: Array[String]) {
      println("OK")
      //可以直接使用父包中的内容
      //1.如果有同名的类，则采用就近原则来使用内容(比如包）
      //2.如果就是要使用父包的类，则指定路径即可
      val user = new User
      println("user = "+user)
      val user2 = new edu.User()
      println("user2 ="+user2)
    }

    }

  }
}











