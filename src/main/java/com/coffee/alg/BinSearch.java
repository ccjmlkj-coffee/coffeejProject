package com.coffee.alg;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9,10};
        System.out.println(search1(arr,1));
        System.out.println(search1(arr,2));
        System.out.println(search1(arr,3));
        System.out.println(search1(arr,4));
        System.out.println(search1(arr,7));
        System.out.println(search1(arr,9));
        System.out.println(search1(arr,10));
        System.out.println(search1(arr,0));
        System.out.println("===================");
        System.out.println(search2(arr,1));
        System.out.println(search2(arr,2));
        System.out.println(search2(arr,3));
        System.out.println(search2(arr,4));
        System.out.println(search2(arr,7));
        System.out.println(search2(arr,9));
        System.out.println(search2(arr,10));
        System.out.println(search2(arr,0));
    }

    static int search1(int[] nums,int target){
        int left=0,right=nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            int val = nums[mid];
            if (val == target){
                return mid;
            }else if (val < target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    static int search2(int[] nums,int target){
        int left=0,right=nums.length;
        while(left <right){
            int mid = (left+right)/2;
            int val = nums[mid];
            if (val == target){
                return mid;
            } else if (val < target) {
                left = mid +1;
            }else{
                right=mid;
            }
        }

        return -1;
    }
}
