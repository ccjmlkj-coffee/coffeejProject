package com.coffee.designPattern.singleton.classes;

/**
 * 因为代码启动的时候，默认创建了static对象
 * 饿汉单例模式 线程安全
 */
public class SingletonEHan {
    private static String eHanName = "my name is eHan";
    private static SingletonEHan singletonEHan = new SingletonEHan() ;

    private SingletonEHan(){
    }

    public String getEHanName(){
        return eHanName;
    }

    public static  SingletonEHan getInstance(){
        if (singletonEHan==null){
            singletonEHan = new SingletonEHan();
        }
        return singletonEHan;
    }

}
