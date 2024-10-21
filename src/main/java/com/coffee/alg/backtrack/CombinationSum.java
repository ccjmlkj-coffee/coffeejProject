package com.coffee.alg.backtrack;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    public static List<List<Integer>> result = new ArrayList<>();
    public static LinkedList<Integer> item = new LinkedList<>();

    public static void main(String[] args) {
        List<List<Integer>> re =  combinationSum(new int[]{2,5,3},4);
        System.out.println("===");
        List<List<Integer>> re1 =  combinationSumV2(new int[]{2,5,2,3},8);
        System.out.println("===");
        System.out.println(re1);
    }
//    public static List<List<Integer>> combinationSum(List<Integer> candidates,int target){
//        candidates = candidates.stream().sorted().collect(Collectors.toList());
//        combinationSum(candidates,target);
//        return result;
//    }
//
//    public static void backtrack(List<Integer> candidates,int target){
//        if (sum() == target){
//            result.add(item);
//        }
//        for (Integer candidate : candidates) {
//            item.add(candidate);
//            if (sum()<target){
//                backtrack(candidates,target);
//                item.removeLast();
//            }
//        }
//    }
//
    public static int sum(){
        int sum = 0;
        for (Integer i : item) {
            sum += i;
        }
        return sum;
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // 先进行排序
        backtracking(res, new ArrayList<>(), candidates, target, 0, 0);
        return res;
    }

    public static void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int sum, int idx) {
        // 找到了数字和为 target 的组合
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            // 如果 sum + candidates[i] > target 就终止遍历
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i);
            path.remove(path.size() - 1); // 回溯，移除路径 path 最后一个元素
        }
    }

    public static List<List<Integer>> combinationSumV2(int[] candidates,int target){
        Arrays.sort(candidates);
        //去重
        Set<Integer> candidatesSet = Arrays.stream(candidates).boxed().collect(Collectors.toSet());
        List<Integer> list = new ArrayList<>(candidatesSet);
        backtrackingV2(list,target,0);
        return result;
    }

    private static void backtrackingV2(List<Integer> candidatesSet, int target,int index) {
        if (sum() == target){
            result.add(new ArrayList<>(item));
        }

        for (int i = index;i<candidatesSet.size();i++){
            item.add(candidatesSet.get(i));
            backtrackingV2(candidatesSet,target,index+1);
            item.removeLast();

        }

    }


}
