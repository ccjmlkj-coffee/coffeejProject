package com.coffee.alg.resume;

import java.util.Collections;
import java.util.Stack;

public class ReverseWords {

    public static String reverseWords(String word){
        Stack<String> stack = new Stack<>();
        String[] split = word.split(" ");
        for (String s : split) {
            stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        while (stack!=null && stack.size()>0){
            if (stack.size() >1){
                sb.append(stack.pop() + " ");

            }else {
                sb.append(stack.pop());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i am a boy"));
    }
}
