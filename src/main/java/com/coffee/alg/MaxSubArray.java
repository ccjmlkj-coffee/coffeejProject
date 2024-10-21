package com.coffee.alg;

import java.util.Arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    /**
     * 取前几个的加和值，如果小于0，则子川重新开始
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
//        int maxSIndex = 0,maxEIndex = 1,maxValue=Integer.MIN_VALUE;
//        if (nums.length < 2){
//            return nums[0];
//        }
//        int tmp = nums[maxSIndex];
//        while(maxEIndex < nums.length){
//            if (nums[maxSIndex] < 0){
//                tmp = tmp - nums[maxSIndex];
//                maxSIndex++;
//            }
//            tmp = tmp + nums[maxEIndex];
//            maxValue = Math.max(tmp,maxValue);
//            maxEIndex++;
//        }
//        return maxValue;


    }
}
