package com.coffee.util;

import com.coffee.Main;

import java.time.Duration;

public class NumberUtils {

    public static long startTime = System.currentTimeMillis();
    public static String Int2ByteStr(int n){
        return Integer.toBinaryString(n);
    }
    public Main main;

    public static void main(String[] args) {
        Duration duration = Duration.ofMillis(System.currentTimeMillis() - 1200000000000L);
        System.out.println(duration);
    }
}
