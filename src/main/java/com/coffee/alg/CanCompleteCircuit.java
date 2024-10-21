package com.coffee.alg;

public class CanCompleteCircuit {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int[] gas1 = {2, 3, 4};
        int[] cost1 = {3, 4, 3};
        int i = canCompleteCircuit(gas, cost);
        int i1 = canCompleteCircuit(gas1, cost1);
        System.out.println(i);
        System.out.println(i1);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
//            int tempG = 0;
            int j = i;
            int tempG = gas[j];
            while (true) {
//                tempG+=gas[j];
                if (tempG >= cost[j]) {
                    tempG = tempG - cost[j];
                    if (j + 1 >= gas.length) {
                        j = 0;
                    } else {
                        j++;
                    }
                    if (j == i) {
                        return i;
                    }
                    tempG = tempG + gas[j];
                } else {
                    break;
                }

            }
        }
        return -1;
    }


    public int canCompleteCircuitPass(int[] gas, int[] cost) {
        int len = gas.length;
        int spare = 0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < len; i++) {
            spare += gas[i] - cost[i];
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }
        if (minSpare > 0) return 0;
        return spare < 0 ? -1 : (minIndex + 1) % len;
    }


}
