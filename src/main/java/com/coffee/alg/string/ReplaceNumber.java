package com.coffee.alg.string;

public class ReplaceNumber {

    public static void main(String[] args) {
        System.out.println(replaceNumber("a1b2c3"));
    }

    public static String replaceNumber(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sb.append("number");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
