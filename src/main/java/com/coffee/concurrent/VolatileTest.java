package com.coffee.concurrent;

public class VolatileTest {
    static  boolean stopOne = false;
    static volatile boolean  stopTwo = false;
    public static void main(String[] args) throws InterruptedException {


        Thread.ofVirtual().factory().newThread(()->{
          while (!stopOne) {
              System.out.println("i am one,still to work!time:"+System.currentTimeMillis());
//              System.out.println(Thread.currentThread());
          }
        }).start();

        Thread.sleep(1000);
        Thread.ofVirtual().factory().newThread(()->{
            stopOne = true;
            System.out.println("to make one stop,time:"+System.currentTimeMillis());
//            System.out.println(Thread.currentThread());
        }).start();

//    thread 2
//        Thread.ofVirtual().factory().newThread(()->{
//            while (!stopTwo) {
//                System.out.println("i am two,still to work!time:"+System.currentTimeMillis());
//            }
//        }).start();
//
//        Thread.sleep(1000);
//        Thread.ofVirtual().factory().newThread(()->{
//            stopTwo = true;
//            System.out.println("to make two stop,time:"+System.currentTimeMillis());
//
//        }).start();


        Thread.sleep(20000);

    }
}
