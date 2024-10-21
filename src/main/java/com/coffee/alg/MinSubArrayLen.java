package com.coffee.alg;

public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(arr,555));
        System.out.println(minSubArrayLenV2(arr,10));
    }

    public static int minSubArrayLen(int[] arr,int target){
        int len = Integer.MAX_VALUE;
        int slow=0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= target){
                int subLen = (i-slow)+1;
                len = Math.min(subLen,len);
                sum = sum-arr[slow++];
//                slow++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public static int minSubArrayLenV2(int arr[],int target){
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= target){
                    len = Math.min(j-i+1,len);
                    break;
                }
            }
        }


        return len==Integer.MAX_VALUE ? 0 : len;
    }
}
