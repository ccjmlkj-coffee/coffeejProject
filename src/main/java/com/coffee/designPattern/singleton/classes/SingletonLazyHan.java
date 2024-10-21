package com.coffee.designPattern.singleton.classes;

/**
 * 懒汉模式+双重检验锁 线程安全
 */
public class SingletonLazyHan {
    private static SingletonLazyHan singletonLazyHan;
    private SingletonLazyHan(){

    };

    //unsafe lazy

    /**
     * 线程不安全写法
     * @return
     */
    public static SingletonLazyHan getSingleLazyHan() throws InterruptedException {

        if (singletonLazyHan==null){
            Thread.sleep(50);//休眠五十毫秒，模拟其他线程进来的情况
            singletonLazyHan = new SingletonLazyHan();
        }
        return singletonLazyHan;
    }

    /**
     * 懒汉模式线程安全写法 双重检验锁
     * @return
     * @throws InterruptedException
     */
    public static SingletonLazyHan getInstance() throws InterruptedException {
        if (singletonLazyHan==null){
            Thread.sleep(50);//休眠五十毫秒，模拟其他线程进来的情况
            synchronized (SingletonLazyHan.class){
                Thread.sleep(50);//休眠五十毫秒，模拟其他线程进来的情况
                if (singletonLazyHan==null){
                    Thread.sleep(50);//休眠五十毫秒，模拟其他线程进来的情况
                    singletonLazyHan = new SingletonLazyHan();
                }
            }
        }
        return singletonLazyHan;
    }

}
