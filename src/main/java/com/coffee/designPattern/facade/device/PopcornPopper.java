package com.coffee.designPattern.facade.device;



/**
 * Created by jingbin on 2016/11/2.
 * 爆米花机
 */

public class PopcornPopper {

    public void on() {
        System.out.println("PopcornPopper---打开爆米花机");
    }

    public void off() {
        System.out.println("PopcornPopper---关闭爆米花机");
    }

    public void makePopcorn() {
        System.out.println("PopcornPopper---制作爆米花");
    }
}
