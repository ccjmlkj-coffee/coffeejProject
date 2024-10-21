package com.coffee.alg;

public class SortedSquares {


    public static void main(String[] args) {
        int[] ans = sortedSquares(new int[]{-4,-3,1,6,9});
        System.out.println("===="+ans);
    }

    static int[] sortedSquares(int[] arr){
        int left=0,right=arr.length-1;
        int[] ans = new int[arr.length];
        int index = arr.length-1;
        while (left<=right){
            int leftVal = arr[left] *  arr[left];
            int rightVal = arr[right] * arr[right];
            if (leftVal>rightVal){
                ans[index] = leftVal;
                index --;
                left ++;
            }else {
                ans[index] = rightVal;
                index --;
                right --;
            }
        }
        return ans;
    }
}
