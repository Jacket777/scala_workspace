package com.lab.chapter10.unit05_map;

import java.util.HashMap;

/**
 * Created by 17081290 on 2020/6/10.
 * 清单 10.5.1
 * Java中map使用
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<String, Integer>();
        hm.put("No1",100);
        hm.put("No2",200);
        hm.put("No3",300);
        hm.put("No4",400);
        hm.put("No1",1000);//更新
        System.out.println(hm);//无序的
        System.out.println(hm.get("No1"));

    }
}
