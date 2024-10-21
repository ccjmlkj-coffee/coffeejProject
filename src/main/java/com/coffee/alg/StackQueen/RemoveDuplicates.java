package com.coffee.alg.StackQueen;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s){
        char[] chars = s.toCharArray();
        Deque<Character> queue = new LinkedList<>();
        for (char aChar : chars) {
            if (!queue.isEmpty() && queue.peek()==aChar){
                queue.poll();
            }else {
                queue.push(aChar);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            sb.append(queue.pollLast());
        }
        return sb.toString();
    }

    public static String removeDuplicatesV2(String s){
//        int fast=1,slow=0;
//        if (s.length() < 2){
//            return s;
//        }
//
//        while(fast < s.length()){
//
//        }
        return "";
    }
}
