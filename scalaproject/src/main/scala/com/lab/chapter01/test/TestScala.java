package com.lab.chapter01.test;

/**
 * Created by 17081290 on 2020/5/14.
 */
//scala运行时进行包装
public class TestScala {
    public static void main(String[] paramArrayOfString) {
        System.out.println("TestScala method .....");
        //TestScala..MODULE$.main(paramArrayOfString);
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

final class TestScala$ {
    public static final TestScala$ MODULE$;
    static {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args) {
        System.out.println("hello");
    }
//    private TestScala$() {
//        MODULE$ = this;
//    }
}