package com.coffee.alg.hashmap;

import java.util.HashSet;

public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n){
        HashSet<Integer> recordSet = new HashSet<>();
        while (n!=1 && !recordSet.contains(n)){
            recordSet.add(n);
            n = getNextVal(n);

        }
        return 1==n;
    }

    public static int getNextVal(int n ){
        int result =0;
        while (n > 0){
            int tmp = n %10;
            result = result +(tmp*tmp);
            n=n/10;
        }
        return result;
    }
}
