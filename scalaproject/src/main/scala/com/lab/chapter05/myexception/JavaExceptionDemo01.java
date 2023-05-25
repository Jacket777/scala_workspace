package com.lab.chapter05.myexception;

/**
 * Created by 17081290 on 2020/6/1.
 * 清单：5.6.1
 * Java异常演示
 */
public class JavaExceptionDemo01 {
    public static void main(String[]args){
        try{
            int i = 0;
            int b = 10;
            int c = b/i;
        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("java finally");
        }

        System.out.println("ok ----继续执行");
    }

}
