package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        System.out.println(combineSum(9, 3));
    }

    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> item = new LinkedList<>();
    public static List<List<Integer>> combine(int n,int k){
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> item = new ArrayList<>();
        backtrack(n,k,1);
        System.out.println(item.size());
        return result;
    }

    /**
     * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
     * @param n
     * @param k
     * @return
     */
    public static List<List<Integer>> combineSum(int n,int k){
        backtrackSum(n,k,1);
        return result;
    }

    public static void backtrackSum(int n,int k,int curIndex){
        if (item.size() == k ){
            if (getSum(item) == n){
                result.add(new ArrayList<>(item));
            }
            return;
        }
        for (int i = curIndex; i < 10; i++) {
            if (item.contains(i)){
                continue;
            }
            item.add(i);
            backtrackSum(n,k,curIndex+1);
            item.removeLast();
        }
    }

    public static Integer getSum(List<Integer> list){
        int result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;
    }


    public static void backtrack(int n,int k,int curIndex){
        if (item.size() == k){
            result.add(new ArrayList<>(item));
            return;
        }
        for (int i = curIndex;i<=n;i++){
            item.add(i);
            backtrack(n,k,curIndex+1);
            item.removeLast();
        }
    }
}
