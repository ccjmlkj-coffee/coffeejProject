package com.coffee.designPattern.facade.device;



/**
 * Created by jingbin on 2016/11/2.
 * 灯光
 */

public class Light {

    public void down() {
        System.out.println("Light---将灯光调暗");
    }

    public void up() {
        System.out.println("Light---将灯光调亮");
    }
}
