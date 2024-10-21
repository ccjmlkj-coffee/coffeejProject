package com.coffee.alg;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] ans = twoSum(nums,6);
        System.out.println("====");
    }
    public static int[] twoSum(int[] nums, int target) {
        int a = 0,b=1;
        int[] ans =new int[2];
        while (a < nums.length-1){
            while (b < nums.length){
                if (nums[a]+nums[b]==target){
                    ans[0]=a;
                    ans[1]=b;
                    return ans;
                }
                b++;
            }
            a++;
            b=1+a;
        }
        return ans;

    }
}
