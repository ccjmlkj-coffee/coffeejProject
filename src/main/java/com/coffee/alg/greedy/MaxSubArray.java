package com.coffee.alg.greedy;

public class MaxSubArray {

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int num =maxSubArray.maxSubArrayV2(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(num);
    }

    /**
     * 超时解法
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums){
        if (nums.length < 1 ){
            return 0;
        }
        int curTotal =0;
        int maxTotal = nums[0];
        int slowIndex = 0;
        while (slowIndex < nums.length){
            for (int fastIndex = slowIndex; fastIndex<nums.length ; fastIndex++){
                curTotal = curTotal + nums[fastIndex];
                maxTotal = Math.max(curTotal,maxTotal);
                if (curTotal <0 || fastIndex >= nums.length-1){
                    curTotal = 0;
                    slowIndex++;
                    break;
                }
            }
        }
        return maxTotal;
    }

    public int maxSubArrayV2(int[] nums){
        if (nums.length < 1 ){
            return 0;
        }
        int curTotal =0;
        int maxTotal = Integer.MIN_VALUE;
        for (int num : nums) {
            if (curTotal > 0){
                curTotal = curTotal+num;
            }else {
                curTotal = num;
            }
            maxTotal = Math.max(maxTotal,curTotal);
        }
        return maxTotal;
    }


}
