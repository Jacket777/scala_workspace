package com.lab.chapter10;

import java.util.ArrayList;

/**
 * Created by 17081290 on 2020/6/9.
 * 清单 10.1 不可变集合
 * scala中不可变集合类似java的数组
 *
 */
public class JavaCollection {
    public static void main(String[] args) {
        int[]nums = new int[3];
        nums[2] = 11;
        nums[2] = 22;

        String[]names = {"bj","sh"};
        System.out.println(nums+" "+names);

        //可变集合举例
        ArrayList al = new ArrayList<String>();
        al.add("zs1");
        al.add("zs2");
        System.out.println(al+ " address ="+al.hashCode());
        al.add("zs3");
        System.out.println(al+ " address ="+al.hashCode());


    }
}
