package com.coffee.virtualthread;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadCreate {

    public static void main(String[] args) throws InterruptedException {
        //线程任务丢到虚拟线程执行
        CustomThread customThread = new CustomThread();
        Thread.startVirtualThread(customThread);
        Thread.sleep(200, TimeUnit.MICROSECONDS.ordinal());

        //先建任务 ofVirtual
        Thread unStartThread = Thread.ofVirtual().unstarted(customThread);
        unStartThread.start();
        //直接启动 ofVirtual
        Thread.ofVirtual().start(customThread);

        //通过工厂创建
        Thread virtualThead = Thread.ofVirtual().factory().newThread(customThread);
        virtualThead.start();
        Thread.sleep(200, TimeUnit.MICROSECONDS.ordinal());

        //使用线程池创建
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(customThread);

    }

    static class CustomThread implements Runnable{

        @Override
        public void run() {
            System.out.println("create a virtual thread , start to run...");
        }
    }
}
