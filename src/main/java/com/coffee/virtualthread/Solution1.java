package com.coffee.virtualthread;

import java.util.*;


public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str1 string字符串 字符串1
     * @param str2 string字符串 字符串2
     * @return string字符串
     */
    public static String longestCommonStr (String str1, String str2) {
        int fastIndex = 0;
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        String result = "";
        int maxLen = 0;
        while (fastIndex < str1.length()){
            int curMax = 0;
            for (char c : str2Arr) {
                if (c == str1Arr[fastIndex]){
                    curMax++;
                    sb.append(c);
                    fastIndex++;
                    if (curMax>maxLen){
                        result = sb.toString();
                        maxLen = curMax;
                    }
                }else{
                    sb = new StringBuilder();
                    curMax=0;
                }
            }
            fastIndex++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] param = new int[3];
        param[0] = 3;
        param[1] = 2;
        param[2] = 1;
        System.out.println(findShortestPath(param));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param placesToVisit int整型一维数组
     * @return int整型ArrayList
     */
    public static ArrayList<Integer> findShortestPath (int[] placesToVisit) {
        ArrayList<Integer> result = new ArrayList<>();
        int[][] distances = {
                {0,30,15,29},
                {30,0,35,25},
                {15,35,0,45},
                {20,25,45,0}
        };
        //记录每次路径的长度
        int cur = 0;
        int minLen = Integer.MAX_VALUE;

        //把入参拆分成三种情况
        for (int i : placesToVisit) {
            ArrayList<Integer> curResult = new ArrayList<>();
            //从当前位置出发，路途计为0
            //选择下一个位置
            List<Integer> nextArr = new ArrayList<>();
            for (int i1 : placesToVisit) {
                if (i1 == i){
                    continue;
                }
                nextArr.add(i1);
            }
            //去下两个位置的距离合
            curResult.add(i);
            int curPos = i;
            for (Integer integer : nextArr) {
                cur =  cur + distances[curPos][integer];
                curPos=integer;
                curResult.add(integer);
            }
            cur = cur + distances[curPos][i];
            curResult.add(i);
            if (cur<minLen){
                result = curResult;
            }
            minLen = Math.min(cur,minLen);


        }
        return result;
    }
}
