package com.lab.chapter07.myextends;

/**
 * Created by 17081290 on 2020/6/15.
 * Java中字段覆写演示
 *
 */

public class JavaFieldOverride {
    public static void main(String[] args) {
      Sub2 sb = new Sub2();
      System.out.println(sb.s);
      Super2 super2 = new Sub2();
      System.out.println(super2.s);
      System.out.println(((Super2)sb).s);
    }
}

class Super2{
    String s = "Super";
}

class Sub2 extends Super2{
    String s = "Sub";
}
