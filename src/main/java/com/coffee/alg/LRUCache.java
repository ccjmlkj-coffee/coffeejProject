package com.coffee.alg;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;

    Map<Integer,CacheObj> cache = new HashMap();

    class CacheObj{
        int val;
        long sore;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public long getSore() {
            return sore;
        }

        public void setSore(long sore) {
            this.sore = sore;
        }

        public CacheObj(int val, long sore) {
            this.val = val;
            this.sore = sore;
        }
    }
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        CacheObj cacheObj = cache.get(key);
        if (cacheObj==null){
            return -1;
        }
        return cacheObj.val;
    }

    public void put(int key, int value) {

    }
}
