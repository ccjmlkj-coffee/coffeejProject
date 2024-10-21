package com.coffee.alg;

public class RemoveElement {
    public static void main(String[] args) {
        int[] param = new int[]{0,1,2,2,3,0,4,2};
//        System.out.println("main len:"+removeElement(param, 2));
        System.out.println("main len:"+removeElementV2(param, 2));
        System.out.println("===");
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                System.out.print(nums[i]);
                index ++;
            }
        }
        System.out.println(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        return index;
    }


    public static int removeElementV2(int[] nums, int val){
        int indexPos = 0;
        for (int num : nums) {
            if (num != val){
                nums[indexPos] = num;
                indexPos++;
            }
        }
        return indexPos;

    }
}
