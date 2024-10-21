package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码组合
 */
public class LetterCombinations {
    public static List<String> result =new ArrayList<>();

    public static void main(String[] args) {
        letterCombinations("234");
        System.out.println(result);
    }

    public static List<String> letterCombinations(String digits){
        if (digits==null || digits.isEmpty()){
            return null;
        }
        String[] numString = {"abcdefghijklmnopqrstuvwxyz"};
        StringBuilder sb = new StringBuilder();
        backtrack(digits,sb,digits.length(),numString);
        return result;
    }

    public static void backtrack(String digits, StringBuilder sb, int len, String[] strDic) {

        //获取digits第一个字符，拿到对应的号码
        String dic = strDic[Integer.parseInt(digits.substring(0, 1))];
        if (sb.length() == 0) {
            sb = new StringBuilder();
        }
        char[] tmpCharArr = dic.toCharArray();
        for (char c : tmpCharArr) {
            sb.append(c);
            if (sb.length() == len) {
                result.add(sb.toString());
            }
            if (len > sb.length()){
                backtrack(digits.substring(1), sb, len, strDic);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
