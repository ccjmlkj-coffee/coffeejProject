package com.coffee.alg.doubleIndex;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,7};
        removeElement(arr,4);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void removeElement(int[] nums,int val){
        int fast=0,slow=0;
        for (int num : nums) {
            if (num != val){
                nums[slow] = num;
                slow++;
            }
            fast ++;
        }
    }
}
