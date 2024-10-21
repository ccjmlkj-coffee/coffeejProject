package com.coffee.alg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MoveArrays {
    public static void main(String[] args) {
        int[] arr = {3,8,9,7,88,843};
//        System.out.println(Arrays.toString(moveArrays(1, arr)));
        System.out.println(Arrays.toString(rotate(3, arr)));
    }

    public static int[] moveArrays(int k,int[] arr){
        if (k > arr.length){
            k=k%arr.length;
        }
        if (k == 0){
            return arr;
        }
        for (int j = 0; j < k; j++) {
            int tmpVal = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (i==arr.length-1){
                    int afterTmp = arr[0];
                    arr[0] = tmpVal;
                    tmpVal = afterTmp;
                }else{
                    int afterTmp = arr[i+1];
                    arr[i+1] = tmpVal;
                    tmpVal = afterTmp;
                }
            }
        }
        return arr;
    }

    public static int[] rotate(int k,int[] nums){
        if (k >= nums.length){
            k=k%nums.length;
        }
        if (k == 0){
            return nums;
        }

        Queue<Integer> queue = new LinkedList<>();
        int firstIndex = nums.length - k;
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[firstIndex]);
            if (firstIndex== nums.length-1){
                firstIndex=0;
            }else {
                firstIndex ++;
            }
//            firstIndex++;
        }
        System.out.println(queue);
        int a = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            nums[a] = queue.poll();
            a++;
        }


        //3 8 9
//        int cur = nums[k-1];
//        for (int i = 0; i < nums.length; i++) {
//            if (k==nums.length-1){
//                int tmp = nums[k];
//                nums[k] = cur;
//                cur = tmp;
//                k =0;
//            }else{
//                int tmp = nums[k];
//                nums[k] = cur;
//                cur = tmp;
//                k++;
//            }
//        }
        return nums;
    }
}
