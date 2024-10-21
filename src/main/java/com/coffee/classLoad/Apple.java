package com.coffee.classLoad;
import java.lang.String;

public class Apple {

    //static 代码块在类完成加载后，按顺序执行
//    public static double price = 20.0D;
    static  Apple apple = new Apple(10);
//    public static double price = 20.0D;


   //final关键字修饰的对象，在类加载器分配内存的时候，会直接赋值
    final static double price = 20.0d;

    public double totalPay;

    public Apple(double discount){
        System.out.println("price:"+price +"\n");
        totalPay = price-discount;
    }

    public static void main(String[] args) {
        System.out.println(Apple.apple.totalPay);
    }
}
