package com.lab.chapter10.unit06_set;

import java.util.HashSet;

/**
 * Created by 17081290 on 2020/6/10.
 * 清单
 * Java中的Set回顾
 * java中，HashSet是实现Set<E>接口的一个实体类，数据是以哈希表的形式存放的，里面的不能包含重复数据。
 Set接口是一种不包含重复元素的 collection，HashSet中的数据也是没有顺序的。
 */
public class JavaHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        System.out.println(hs);
    }
}
