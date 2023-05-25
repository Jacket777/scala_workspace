package com.lab.chapter06.constructor;

/**
 * Created by 17081290 on 2020/6/2.
 */
public class PersonA {
    public String name;
    public int age;

    public String getInfo(){
        return name+"\t"+age;
    }

    public PersonA(){
        age = 18;
    }

    public PersonA(String name,int age){
        this.name = name;
        this.age =age;
    }
}
