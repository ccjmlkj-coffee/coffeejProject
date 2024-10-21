package com.coffee.designPattern.facade.device;



/**
 * Created by jingbin on 2016/11/2.
 * 播放器
 */

public class Player {

    public void on() {
        System.out.println("Player---打开播放器");
    }

    public void off() {
        System.out.println("Player---关闭播放器");
    }

    public void make3DListener() {
        System.out.println("Player---将播放器音调设为环绕立体声 ");
    }
}
