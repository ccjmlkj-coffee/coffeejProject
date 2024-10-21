package com.coffee.alg.greedy;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int sum = maxProfit.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(sum);
        int sum2 = maxProfit.maxProfit(new int[]{1,2,3,4,5});
        System.out.println(sum2);

    }

    public int maxProfit(int[] nums){
        int ans = 0;
        if (nums.length <= 1){
            return ans;
        }
        for (int i = 1;i<nums.length;i++){
            int curProfit = nums[i] - nums[i-1];
            if (curProfit > 0){
                ans += curProfit;
            }
        }

        return ans;
    }
}
