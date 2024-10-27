package com.coffee.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class CommonTest {

    static int[] common;
    public static void main(String[] args) {
//       for (int[] tab= common; ;){
//           System.out.println("---");
//       }

        int n = 16;
        int[] arr=new int[16];
        int sc = n - (n >>> 2);

        System.out.println(sc);

        out: for (int i =0;i<=10 || i>30;i++){

            System.out.println("current val:"+i);
            if (i == 10){
                continue  out;
            }
        }


        System.out.println("NCPU:"+Runtime.getRuntime().availableProcessors());
    }
}
