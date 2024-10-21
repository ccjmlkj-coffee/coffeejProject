package com.coffee.alg;

import java.util.ArrayList;
import java.util.List;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] param1 = {1,2,3,4};
        int[] param2 = {-1,1,0,-3,3};
        System.out.println(productExceptSelf(param1));
    }

    public static int[] productExceptSelf(int[] nums){
        int[] result=new int[nums.length];
        List<Integer> zeroIndexArr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) zeroIndexArr.add(i);
            sum+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroIndexArr.size() >=2){
                result[i] = 0;
            }
            if (zeroIndexArr.size()==1 && !zeroIndexArr.contains(i)){
                result[i] = 0;

            }
            if (i==nums.length-1){
                result[i] = (sum-nums[i]-nums[0]) * nums[0];
            }else{
                result[i] = (sum-nums[i]-nums[i+1]) * nums[i+1];
            }
        }
        return result;
    }
}
