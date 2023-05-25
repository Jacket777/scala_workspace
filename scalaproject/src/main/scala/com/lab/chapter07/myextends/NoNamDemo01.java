package com.lab.chapter07.myextends;

/**
 * Created by 17081290 on 2020/6/9.
 * 匿名子类使用
 */
public class NoNamDemo01 {
    public static void main(String[] args) {
        A4 a4 = new A4(){
            @Override
            public void cry(){
                System.out.println("cry.....");
            }
        };
        a4.cry();

    }
}

abstract class A4{
    abstract public void cry();
}
