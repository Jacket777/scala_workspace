package com.lab.chapter03.inputcon;

import java.util.Scanner;

/**
 * Created by 17081290 on 2020/5/21.
 * 清单3.5.从控制台输入信息
 */
public class ReadCon {

    public static void main(String[]args){
        System.out.println("请输入姓名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入年龄: ");
        int age = scanner.nextInt();
        System.out.println("请输入薪水: ");
        double sal = scanner.nextDouble();
        System.out.printf("用户的信息为: name=%s, age=%d,sal=%.2f",name,age,sal);

    }
}
