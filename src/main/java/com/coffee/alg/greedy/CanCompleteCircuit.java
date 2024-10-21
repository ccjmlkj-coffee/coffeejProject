package com.coffee.alg.greedy;

public class CanCompleteCircuit {


    public int canCompleteCircuit(int[] gas,int[] cost){
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for (int i=0 ;i<gas.length;i++ ) {
            int curCost = cost[i] - gas[i];
            curSum += curCost;
            totalSum += curCost;
            if (curSum < 0){
                curSum = 0;
                start = i+1;
            }
        }
        if (totalSum <0) return  -1;
        return start;
    }
}
