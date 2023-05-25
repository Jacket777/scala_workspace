package com.lab.chapter06.oop



/**
  * Created by 17081290 on 2020/6/1.
  * 清单6.1.1
  * 类的使用
  */
object CatDemo {

  def main(args: Array[String]) {

    val cat = new Cat
    /* 类属性使用注意事项
    1.cat.name="Jack" 不是直接访问属性，而是调用cat.name_$eq("Jack")
    2.cat.name等价于cat.name()
     */
    cat.name = "Jack"
    cat.age = 10
    cat.color = "white"
    //对应的Java代码
    /*
    Cat cat = new Cat();
    cat.name_$eq("Jack");
    cat.age_$eq(10);
    cat.color_$eq("white");
    Predef..MODULE$.printf("the cat information as: %s  %d  %s", Predef..MODULE$.genericWrapArray(new Object[] { cat.name(), BoxesRunTime.boxToInteger(cat.age()), cat.color() }));
     */

    printf("the cat information as: %s  %d  %s",cat.name,cat.age,cat.color)
  }
}

/**
  * 一个class Cat对应的字节码只有一个Cat.class，默认为public
  */
class Cat{

   // 类属性注意事项
   // 1.一定要给初始值，否则报错，给一个初始值
   // 2.属性在底层对应为private name
   // 3.同时生成两个public 方法  name（） 《=类似于get方法， name_$eq()类似setter
  var name:String=""
  var age:Int= _ //给age一个默认的值，如果Int，默认为0
  var color:String=_ //给string一个默认的值，如果String，默认为"
}

//对应Java代码
/*
public class Cat
{
  private String name = "";
  private int age;
  private String color;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public int age() { return this.age; }
  public void age_$eq(int x$1) { this.age = x$1; }
  public String color() { return this.color; }
  public void color_$eq(String x$1) { this.color = x$1;
  }
}
 */

class Dog{
  var name="Jack"
  var lover = new Fish
}

class Fish{

}

class A{
  var var1:String=_ //null
  var var2:Byte=_ //0
  var var3:Double=_ //0.0
  var var4:Boolean=_ //false
}