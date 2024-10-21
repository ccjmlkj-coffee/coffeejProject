package com.coffee.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BasicThreadPool {

     volatile ThreadPoolExecutor threadPool;
    public  ThreadPoolExecutor getTheadPool(){
        if (threadPool == null){
            synchronized (BasicThreadPool.class){
                if (threadPool == null){
                    /**
                     * 八个核心线程
                     * 100个最大线程
                     * 线程存活时间
                     * 阻塞队列长度1000
                     */
                    threadPool = new ThreadPoolExecutor(8,100,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000000000));
                }
            }
        }
        return threadPool;
    }

    public static void main(String[] args) {

    }
}
