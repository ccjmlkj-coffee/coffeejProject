package com.coffee.alg.StackQueen;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] ans = maxSlidingWindowV2(new int[]{1,3,-1,-3,5,3,6,7},3);

        for (int an : ans) {
            System.out.println(an);
        }
    }

    /**
     * 暴力解法会超时
     * @param nums
     * @param k
     * @return
     */
    public static int[] maxSlidingWindow(int[] nums,int k){
        if (nums.length < k){
            return new int[0];
        }
        int[] ans = new int[nums.length-k+1];
        int end = k-1;
        int start = 0;
        while (end < nums.length){
            int c = 0;
            int[] sub = getSubArrForIndex(nums,start,end);
            int max = Arrays.stream(sub).max().getAsInt();
            ans[start] = max;
            start++;
            end++;
            int j=0;
        }
        return ans;
    }

    public static int[] getSubArrForIndex(int[] nums,int s,int e){
        int[] ans = new int[e-s+1];
        int index = 0;
        while (s < e+1){
            ans[index] = nums[s];
            index++;
            s++;
        }
        return ans;
    }

    static class MyQueue{
        Deque<Integer> deque = new LinkedList<>();
        void MyQueue(){
            deque = new LinkedList<>();
        }

        void poll(int val){
            if (!deque.isEmpty() && deque.peek() == val){
                deque.poll();
            }
        }

        void add(int val){
            while(!deque.isEmpty() && val > deque.peek()){
                deque.removeLast();
            }
            deque.add(val);
        }
        int peek(){
            return deque.peek();
        }
    }

     static int[] maxSlidingWindowV2(int[] nums,int k) {
         if (nums.length < k) {
             return new int[0];
         }
         int[] ans = new int[nums.length - k + 1];
         MyQueue myQueue = new MyQueue();
         for (int i = 0; i < k; i++) {
             myQueue.add(nums[i]);
         }
         int index = 0;
         for (int i = k ; i < nums.length; i++) {
             myQueue.poll(nums[i]);
             myQueue.add(nums[i]);
             int maxVal = myQueue.peek();
             ans[index] = maxVal;
             index++;
         }
         return ans;


//         if (nums.length == 1) {
//             return nums;
//         }
//         int len = nums.length - k + 1;
//         //存放结果元素的数组
//         int[] res = new int[len];
//         int num = 0;
//         //自定义队列
//         MyQueue myQueue = new MyQueue();
//         //先将前k的元素放入队列
//         for (int i = 0; i < k; i++) {
//             myQueue.add(nums[i]);
//         }
//         res[num++] = myQueue.peek();
//         for (int i = k; i < nums.length; i++) {
//             //滑动窗口移除最前面的元素，移除是判断该元素是否放入队列
//             myQueue.poll(nums[i - k]);
//             //滑动窗口加入最后面的元素
//             myQueue.add(nums[i]);
//             //记录对应的最大值
//             res[num++] = myQueue.peek();
//         }
//         return res;

     }
}
