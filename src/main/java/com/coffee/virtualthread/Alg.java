package com.coffee.virtualthread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Alg {

    public static void main(String[] args) {
        System.out.println(getMinSubStr("ADOBECODEBANC","ABC"));

    }


    public static String getMinSubStr(String s,String t){
        String result = "";
        int minLen = 0;
        char[] tArr = t.toCharArray();
        int tIndex = 0;

        char[] sArr = s.toCharArray();
//        int sIndex = 0;

        for (int i=0;i<sArr.length;i++) {
            HashSet<Character> set = new HashSet<>();
            for (char c : tArr) {
                set.add(c);
            }
            int curLen = 0;
            StringBuilder sb = new StringBuilder();
            for(int sIndex=i;sIndex<s.length();sIndex++){
                if (set.contains(sArr[sIndex])){
                    tIndex++;
                    sIndex++;
                    curLen ++;
                    sb.append(sArr[sIndex]);
                    if (tIndex==tArr.length){//表示找到匹配字符串
                        minLen = Math.min(minLen,curLen);
                        result = sb.toString();
                    }
                }else{
                    tIndex=0;
                    break;
                }
            }

        }

        return result;
    }
}
