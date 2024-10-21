package com.coffee.alg.StackQueen;

import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {
        System.out.println(isValid("{{{{{{"));
        System.out.println(isValid("{{{{{{}}}}}}"));
        System.out.println(isValid("{{{({{{}}})}}}"));
        System.out.println(isValid("{{{({{{}{}][}})}}}"));
    }


    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        char c;
        for (char aChar : chars) {
            if (aChar == '('){
                stack.push(')');
            }else if (aChar == '{'){
                stack.push('}');
            } else if (aChar == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != aChar) {
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
}
