package com.lab.chapter07.javapackage;

/**
 * Created by 17081290 on 2020/6/3.
 * 清单 7.1.1
 * Java 包的使用
 */
public class TestTiger {
    public static void main(String[]args){
        com.lab.chapter07.javapackage.xm.Tiger tiger01 =
                new com.lab.chapter07.javapackage.xm.Tiger();

        com.lab.chapter07.javapackage.xh.Tiger tiger02 =
                new com.lab.chapter07.javapackage.xh.Tiger();
        System.out.println("tiger01="+tiger01+" tiger02="+tiger02);
    }
}
