package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute {

    public List<List<Integer>> result = new ArrayList<>();
    public LinkedList<Integer> item = new LinkedList<>();

    public static void main(String[] args) {
        Permute permute = new Permute();
        System.out.println(permute.permute(new int[]{1,2,3,4}).size());
        System.out.println(permute.permute(new int[]{1,2,3,4}));
        System.out.println(permute.permute(new int[]{1,2,3,4}).size());

    }

    public List<List<Integer>> permute(int[] nums){
        backtrack(nums,nums.length);
        return result;
    }

    public void backtrack(int[] nums,int total){
        if (item.size() == total){
            result.add(new ArrayList<>(item));
            return;
        }
        for (int num : nums) {
            item.add(num);
            backtrack(removeVal(nums,num),total);
            item.removeLast();
        }
    };

    public int[] removeVal(int[] nums,int val){
        int[] result = new int[nums.length-1];
        int index = 0;
        boolean op = false;
        for (int num : nums) {
            if (num != val || op){
                result[index++] = num;
            }else{
                op = true;
            }
        }
        return result;
    }
}
