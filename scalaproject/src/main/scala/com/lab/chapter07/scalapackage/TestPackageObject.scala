/**
  * 包对象演示
  * 1.在包中直接写方法，或者定义变量，就错误-->使用包对象的技术解决
  * 2.package object testpackageObject 表示创建一个包对象testpackageObject，
  * 它是testpackageObject这个包对应的包对象
  * 3.每一个包都可以有一个包对象
  * 4.包对象的名字需要和包一样
  * 5.在包对象中够可以定义变量和方法
  * 6.在包对象中定义的变量和方法，就可以在对应的包中使用
  * 7.在底层这个包对象会生成两个类package$ 和package
  */




package object testpackageObject{
  var name = "king"
  def sayHi():Unit={
    println("package object scala say hi")

  }
}


package testpackageObject {
  class Person{ //表示在testpackageObject 创建类Person
    val name = "Nick"

    def play(message:String):Unit={
      println(this.name+" "+message)
    }
  }


  class User{
    def testUser():Unit={
      println("name = "+name)
      sayHi()
    }

  }

  object TestPackageObject {  //表示在testpackageObject 创建object TestPackageObject
    def main(args: Array[String]) {
           println("name = "+name)
           name = "yy"
           sayHi()
    }
  }

}



