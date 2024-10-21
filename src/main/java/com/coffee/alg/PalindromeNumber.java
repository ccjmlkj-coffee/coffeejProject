package com.coffee.alg;

import java.util.Stack;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(checkPalindrome(101));
    }

    public static boolean checkPalindrome(long number){
        if (number < 0) {
            return false;
        }
        String numStr = String.valueOf(number);
        char[] charArr = numStr.toCharArray();
        Stack<Character> numStack = new Stack<>();
        for (char c : charArr) {
            numStack.push(c);
        }
        for (char c : charArr) {
            if (numStack.pop()!=c){
                return false;
            }
        }
        System.out.println(10^0);
        System.out.println(10^1);
        return true;

    }
}
