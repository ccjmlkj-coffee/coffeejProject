package com.coffee.designPattern.facade.device;


/**
 * Created by jingbin on 2016/11/2.
 */

public class Computer {

    public void on() {
        System.out.println("Computer---打开电脑");
        System.out.println();
    }

    public void off() {
        System.out.println("Computer---关闭电脑");
    }
}
