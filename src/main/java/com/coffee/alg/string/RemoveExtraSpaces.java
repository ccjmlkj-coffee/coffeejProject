package com.coffee.alg.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveExtraSpaces {

    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("hello , what  is your name"));
    }
    public static  String removeExtraSpaces(String s){
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }


}
