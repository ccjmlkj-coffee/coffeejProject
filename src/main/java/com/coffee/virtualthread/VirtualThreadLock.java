package com.coffee.virtualthread;

import java.util.concurrent.locks.ReentrantLock;

public class VirtualThreadLock {
    public static void main(String[] args) throws Exception {
        ReentrantLock lock = new ReentrantLock();
        Thread.startVirtualThread(() -> {
//            lock.lock();     // <------ 这里确保锁已经被另一个虚拟线程持有
            System.out.println("lock");
            /**
             * 尝试释放锁
             */
//            try {
//                TimeUnit.MILLISECONDS.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            lock.unlock();
        });
        Thread.sleep(1000);
        Thread.startVirtualThread(() -> {
            System.out.println("first");
            lock.lock();
            try {
                System.out.println("second");
            } finally {
                lock.unlock();
            }
            System.out.println("third");
        });
        Thread.sleep(Long.MAX_VALUE);
    }
}
