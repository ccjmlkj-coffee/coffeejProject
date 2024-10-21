package com.coffee.alg;

import java.util.Arrays;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {2,5,66,22,41,23};
        int result = findKthLargest(nums,2);
        System.out.println(result);
    }
    public static int findKthLargest(int[] nums, int k) {
        nums = Arrays.stream(nums).sorted().toArray();
        if (nums.length-k <0 ){
            return -1;
        }
        return nums[nums.length -k ];
    }
}
