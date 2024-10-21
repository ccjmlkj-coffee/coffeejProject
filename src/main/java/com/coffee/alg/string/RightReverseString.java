package com.coffee.alg.string;

public class RightReverseString {

    public static void main(String[] args) {
        System.out.println(rightReverseString("abcdefg", 2));
    }

    public static String rightReverseString(String s,int k){
        StringBuilder sb = new StringBuilder();
        int firstStar = s.length()-k;
        while (firstStar < s.length()){
            sb.append(s.charAt(firstStar));
            firstStar++;
        }
        int secondStar = 0;
        while(secondStar < s.length()-k){
            sb.append(s.charAt(secondStar));
            secondStar++;
        }
        return sb.toString();
    }
}
