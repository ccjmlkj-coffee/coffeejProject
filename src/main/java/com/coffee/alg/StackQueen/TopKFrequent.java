package com.coffee.alg.StackQueen;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void main(String[] args) {
        int result[] = topKFrequent2(new int[]{1,1,1,2,2,3},2);
        System.out.println(result.toString());
    }

    public static int[] topKFrequent2(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]>  queue=  new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
        map.forEach((key,value)->{
            if (queue.size()<k){
                queue.add(new int[]{key,value});
            }else{
                if (queue.peek()[1] < value){
                    queue.poll();
                    queue.add(new int[]{key,value});
                }
            }
        });
        int[] ans = new int[k];
        for (int i = k-1; i >= 0; i--) {
            ans[i] = queue.poll()[0];
        }
        return ans;
    }
}
