package com.coffee.designPattern.singleton.classes;

/**
 * 内部类，使用类装载机制实现单例模式，实现方式与饿汉相同
 * 区别：内部类只有在内部类使用的时候才会装载
 */
public class InClassSingleton {
    private InClassSingleton(){};

    private static final class InClassSingletonHolder {
        static final InClassSingleton inClassSingleton = new InClassSingleton();
    }

    public static InClassSingleton getInstance() throws InterruptedException {
        return InClassSingletonHolder.inClassSingleton;
    }
}
