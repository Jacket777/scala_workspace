package com.lab.chapter07.myextends;

/**
 * Created by 17081290 on 2020/6/9.
 * Java动态绑定
 * 1.如果调用的是方法，则JVM会将该方法和对象的内存地址绑定
 * 2.如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应的值
 */
public class JavaDynamicBind {
    public static void main(String[] args) {
        A1 a1 = new B1();
        System.out.println(a1.sum());
        System.out.println(a1.sum1());

    }
}

class A1{
    public int i = 10;

    public int sum(){
        return getI()+10;
    }

    public int sum1(){
        return i+10;
    }

    public int getI(){
        return i;
    }
}


class B1 extends A1{
    public int i = 20;

//    //public int sum(){
//        return i+20;
//    }
    public int getI(){
        return i;
    }

//    public int sum1(){
//        return i+10;
//    }

}
