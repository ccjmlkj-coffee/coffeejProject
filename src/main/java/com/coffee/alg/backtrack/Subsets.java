package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> item = new LinkedList<>();

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        List<List<Integer>> ans = subsets.subsetsV3(new int[]{4,6,7,7});
        System.out.println(ans);
    }


    public List<List<Integer>> subsets(int[] nums){
        if (nums==null){
            return new ArrayList<>();
        }
        backtrack(nums,0);
        return result;
    }

    public void backtrack(int[]nums,int index){
        result.add(new ArrayList<>(item));
        if (index>=nums.length){
            return;
        }
        for (int i =index;i<nums.length;i++){
            int val = nums[i];
            item.add(val);
            backtrack(nums,i+1);
            item.removeLast();
        }
    }

    /**
     * 获取不重复的子集
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsV2(int[] nums){
        if (nums==null){
            return new ArrayList<>();
        }
        backtrackV2(nums,0);
        return result;
    }

    public void backtrackV2(int[]nums,int index){
        result.add(new ArrayList<>(item));
        if (index>=nums.length){
            return;
        }
        List<Integer> tmp = new ArrayList<>();//存储当前遍历，已经使用过的元素
        for (int i =index;i<nums.length;i++){
            int val = nums[i];
            if (tmp.contains(val)){//用过改元素，剪枝
                continue;
            }
            tmp.add(val);
            item.add(val);
            backtrackV2(nums,i+1);
            item.removeLast();
        }
    }


    public List<List<Integer>> subsetsV3(int[] nums){
        if (nums==null){
            return new ArrayList<>();
        }
        backtrackV3(nums,0);
        return result;
    }

    public void backtrackV3(int[]nums,int index){
        if (item.size()>=2){
            result.add(new ArrayList<>(item));
        }
        if (index>=nums.length){
            return;
        }
        List<Integer> tmp = new ArrayList<>();//存储当前遍历，已经使用过的元素
        for (int i =index;i<nums.length;i++){
            int val = nums[i];
            if (tmp.contains(val)){//用过改元素，剪枝
                continue;
            }
            tmp.add(val);
            item.add(val);
            backtrackV3(nums,i+1);
            item.removeLast();
        }
    }

}
