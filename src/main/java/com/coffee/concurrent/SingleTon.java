package com.coffee.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class SingleTon {
    public volatile SingleTon singleTon;
    public static AtomicInteger number = new AtomicInteger(0);
    public SingleTon getInstance(){
        System.out.println("try to instance, count:"+number.getAndAdd(1));
        if (singleTon == null){
            synchronized (SingleTon.class){
                if (singleTon == null){
                    System.out.println("====start install singleTon====");
                    singleTon =  new SingleTon();
                }
            }
        }
        return  singleTon;
    }

    public  String getString(){
        return "singleTon";
    }

    public static void main(String[] args) throws InterruptedException {
        SingleTon singleTon1 = new SingleTon();
        AtomicInteger count = new AtomicInteger(1);
        BasicThreadPool basicThreadPool = new BasicThreadPool();
        for (int i = 0; i < 100000000; i++) {
            basicThreadPool.getTheadPool().execute(() ->{
                System.out.println(singleTon1.getInstance());
            });
        }
        System.out.println("end");
    }

}
