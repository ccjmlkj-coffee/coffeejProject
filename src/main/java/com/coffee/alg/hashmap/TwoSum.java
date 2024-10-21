package com.coffee.alg.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] ans1 = twoSum(new int[]{2,7,11,15},9);
        int[] ans2 = twoSum(new int[]{3,2,4},6);
        int[] ans3 = twoSum(new int[]{3,3},6);
        System.out.println("====");
    }

    public static int[] twoSum(int[] nums,int target){
        int[] ans =new int[2];
        if (nums==null || nums.length ==0){
            return ans;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)){
                ans[0] = i;
                ans[1] = map.get(key);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
