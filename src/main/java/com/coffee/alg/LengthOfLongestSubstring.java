package com.coffee.alg;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("akbkjaa");
        System.out.println(max);
    }

    public static int lengthOfLongestSubstring(String str){
        char[] charArr = str.toCharArray();
        Set<Character>  characters = new HashSet<>();
//        int i = 0;
        int max = 0;
        for (int i = 0;i < charArr.length;i++){
            int curMax = 0;
            for (int j=i;j < charArr.length;j++){
                characters.add(charArr[j]);
                curMax ++;
                if (characters.size()<curMax){
                    max = Math.max(characters.size(),max);
                    characters = new HashSet<>();
                    break;
                }
            }
        }

        return max;
    }
}
