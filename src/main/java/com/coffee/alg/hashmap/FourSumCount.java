package com.coffee.alg.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }

    public static int fourSumCount(int[] nums1,int[] nums2,int[] nums3,int[] nums4)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int i1 : nums2) {
                map.put(i+i1,map.getOrDefault(i+i1,0)+1);
            }
        }
        int count = 0;
        for (int i : nums3) {
            for (int i1 : nums4) {
               count += map.getOrDefault(-i - i1,0);
            }
        }
        return count;
    }
}
