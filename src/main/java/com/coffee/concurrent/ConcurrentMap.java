package com.coffee.concurrent;

import com.coffee.util.NumberUtils;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    static final int HASH_BITS = 0x7fffffff; // usable bits of normal node hash
    public static void main(String[] args) {
        String key = "makaijian";
        int h = key.hashCode();
        System.out.println(h);
        System.out.println(NumberUtils.Int2ByteStr(h));
        System.out.println(NumberUtils.Int2ByteStr(h >>> 16));
        System.out.println(NumberUtils.Int2ByteStr(h ^ (h >>> 16)));
        System.out.println((h ^ (h >>> 16)) & HASH_BITS);
    }
}
