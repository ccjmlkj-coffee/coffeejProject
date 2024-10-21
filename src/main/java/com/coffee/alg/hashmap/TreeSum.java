package com.coffee.alg.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {

    public static void main(String[] args) {
        System.out.println(treeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> treeSum(int[] nums){
        //排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                return result;
            }
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i +1;
            int right = nums.length-1;
            while(right > left){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(right > left && nums[left+1] == nums[left]) left++;
                    while (right > left && nums[right] == nums[right]) right--;
                    left++;right--;
                }else if (sum >0){
                    right --;
                }else {
                    left ++;
                }

            }

        }


        return result;
    }
}
