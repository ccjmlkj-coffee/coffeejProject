package com.coffee.alg.hashmap;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {

        int[] ans = intersection(new int[]{1,2,2,1},new int[]{1,2,5});
        System.out.println(ans);
    }

    public static int[] intersection(int[] nums1,int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        int[] ans;
        if (set1.size() > set2.size()){
            set1.removeAll(set2);
            ans = new int[set1.size()];
            int index=0;
            for (Integer i : set1) {
                ans[index] = i;
                index++;
            }
        }else {
            set2.removeAll(set1);
            int index=0;
            ans = new int[set2.size()];
            for (Integer i : set2) {
                ans[index] = i;
                index++;
            }
        }
        return ans;

    }

    public int[] intersectionV2(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }

        //方法1：将结果集合转为数组

        return resSet.stream().mapToInt(Integer::intValue).toArray();

        //方法2：另外申请一个数组存放setRes中的元素,最后返回数组
//        int[] arr = new int[resSet.size()];
//        int j = 0;
//        for (int i : resSet) {
//            arr[j++] = i;
//        }
//
//        return arr;
    }
}
