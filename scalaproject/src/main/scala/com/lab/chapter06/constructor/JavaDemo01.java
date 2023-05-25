package com.lab.chapter06.constructor;



/**
 * Created by 17081290 on 2020/6/4.
 * Java构造器调用
 */
public class JavaDemo01 {
    public static void main(String[] args) {

    }

}

class AAA{
    public AAA(){
        //这里调用AAA(String name)
        this("aaa");
        System.out.println("AAA()");
    }

    public AAA(String name){

    }
}
