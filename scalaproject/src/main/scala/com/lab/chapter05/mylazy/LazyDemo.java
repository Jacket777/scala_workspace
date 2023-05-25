package com.lab.chapter05.mylazy;

/**
 * Created by 17081290 on 2020/6/1.
 * 清单：5.5.1
 * Java实现懒加载代码
 */
public class LazyDemo {
    private String property; //属性也可能是一个数据库连接，文件等资源

    public String getProperty(){
        //如果没有初始化，那么进行初始化
        if(property == null){
           property = initProperty();
        }
        return property;
    }


    private String initProperty(){
        return "property";
    }
}
