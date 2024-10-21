package com.coffee.alg;

public class CanJump {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        boolean result = false;
        //从后面遍历，如果找到可以跳到当前位置的，则递归
        return jumpMethod(nums.length-1,nums);
        //若跳到当前位置的是数组的第一个，则遍历完成

    }

    public static boolean jumpMethod(int index,int[] nums){
        if (nums.length==1){
            return true;
        }
        boolean result = false;
        //从后面遍历，如果找到可以跳到当前位置的，则递归
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] >= index-i && i !=0){
                result = jumpMethod(i-1,nums);
                if (result){
                    return result;
                }

            } else if (nums[i] >=index-i && i ==0) {        //若跳到当前位置的是数组的第一个，则遍历完成
                return true;
            }
        }
        return result;
        //若跳到当前位置的是数组的第一个，则遍历完成
    }


    public int jump(int[] nums) {
        int pos = nums.length-1;
        int step = 0;
        while(pos > 0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= pos-i){
                    step ++;
                    pos=i;
                }
            }
        }
        return step;
    }
}
