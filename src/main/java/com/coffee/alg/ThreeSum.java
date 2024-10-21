package com.coffee.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,1,1};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0;i<nums.length-2;i++){
            if (i > 0 && nums[i]==nums[i-1]) continue;
            int s=i+1,e=nums.length-1;
            while (s < e){
                List<Integer> cur = new ArrayList<>();
                int sum = nums[i] + nums[s] +nums[e];
                if (sum == 0){
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[s],nums[e])));
                    while (nums[s] == nums[++s]&& s < e) ;
                    while (nums[e] == nums[--e]&& s < e) ;
                    ++s;--e;
                } else if (sum <0) {
                    ++s;

                }else {
                    --e;
                }


            }
        }

        return result;
    }
}
