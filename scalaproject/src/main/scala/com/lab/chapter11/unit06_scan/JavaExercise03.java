package com.lab.chapter11.unit06_scan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 17081290 on 2020/6/28.
 */
public class JavaExercise03 {
    public static void main(String[]args){
        String sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD";
        Map<Character, Integer> charCountMap =
                new HashMap<Character, Integer>();
        char[] cs = sentence.toCharArray();
        for ( char c : cs ) {
            if ( charCountMap.containsKey(c) ) {
                Integer count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                charCountMap.put(c, 1);}}
        System.out.println(charCountMap);


    }
}
