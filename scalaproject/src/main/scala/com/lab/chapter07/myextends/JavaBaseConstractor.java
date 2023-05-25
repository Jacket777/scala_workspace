package com.lab.chapter07.myextends;

/**
 * Created by 17081290 on 2020/6/9.
 * Java中超类的构造
 *
 */
public class JavaBaseConstractor {
    public static void main(String[] args) {

        B b = new B();
        B b2 = new B("jack");

    }

}


class A {
    public A(){
        System.out.println("A()");
    }

    public A(String name){
        System.out.println("A(String name)"+name);
    }
}


class B extends A {
    public B(){
        //这里会隐式调用super()，就是无参的父类构造器A()
        //super();
        System.out.println("B()");
    }

    public B(String name){
        super(name);
        System.out.println("B(String name)"+name);
    }
}
