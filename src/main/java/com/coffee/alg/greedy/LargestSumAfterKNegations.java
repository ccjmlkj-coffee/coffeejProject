package com.coffee.alg.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSumAfterKNegations {

    public static void main(String[] args) {
        LargestSumAfterKNegations largestSumAfterKNegations = new LargestSumAfterKNegations();
        int sum = largestSumAfterKNegations.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4},2);
        System.out.println("result:"+sum);
    }

    public int largestSumAfterKNegations(int[] nums,int k){
        int sum = 0;
        Arrays.sort(nums);
        int changeIndex = 0;
        int changeTime = 0;
        for (int i = 0; i < nums.length; i++) {
            if (changeTime == k){
                break;
            }
            if (nums[changeIndex] != 0){
                nums[changeIndex] = -nums[changeIndex];
                changeIndex++;
                changeTime++;
            }else{
                nums[changeIndex] = - nums[changeIndex];
                changeTime++;
            }

        }
        sum= Arrays.stream(nums).sum();
        return sum;
    }

    public int largestSumAfterKNegationsV2(int[] nums, int K) {
        // 将数组按照绝对值大小从大到小排序，注意要按照绝对值的大小
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            //从前向后遍历，遇到负数将其变为正数，同时K--
            if (nums[i] < 0 && K > 0) {
                nums[i] = -nums[i];
                K--;
            }
        }
        // 如果K还大于0，那么反复转变数值最小的元素，将K用完

        if (K % 2 == 1) nums[len - 1] = -nums[len - 1];
        return Arrays.stream(nums).sum();

    }
}
