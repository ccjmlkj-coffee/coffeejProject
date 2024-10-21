package com.coffee.designPattern.singleton;

import com.coffee.designPattern.singleton.classes.SingletonEHan;
import com.coffee.designPattern.singleton.classes.SingletonEnum;
import com.coffee.designPattern.singleton.classes.SingletonLazyHan;

import java.util.concurrent.*;

public class singletonTest {
    public static void main(String[] args) throws InterruptedException {
        SingletonEHan singletonEHan = SingletonEHan.getInstance();
        System.out.println(singletonEHan+"name is:"+singletonEHan.getEHanName());
        SingletonEHan singletonEHan1 = SingletonEHan.getInstance();
        System.out.println(singletonEHan1+"name is:"+singletonEHan1.getEHanName());
        SingletonLazyHan singletonLazyHan1 = SingletonLazyHan.getInstance();
        SingletonLazyHan singletonLazyHan2 = SingletonLazyHan.getInstance();
        System.out.println(singletonLazyHan1);
        System.out.println(singletonLazyHan2);
        ExecutorService executorService = new ThreadPoolExecutor(100,200,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        for (int i = 0; i < 100; i++) {
            //测试懒汉线程不安全写法
            CompletableFuture.supplyAsync(()->{
                SingletonLazyHan singletonLazyHan = null;
                try {
                    singletonLazyHan = SingletonLazyHan.getSingleLazyHan();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(singletonLazyHan);
                return true;
            },executorService);
        }

        //证明双重检验锁，线程安全
        for (int i = 0; i < 100; i++) {
            //测试懒汉线程不安全写法
            CompletableFuture.supplyAsync(()->{
                SingletonLazyHan singletonLazyHan = null;
                try {
                    singletonLazyHan = SingletonLazyHan.getInstance();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(singletonLazyHan);
                return true;
            },executorService);
        }
        Thread.sleep(2000);

        System.out.println(SingletonEnum.instance);
        SingletonEnum.instance.whateverMethod();


    }
}
