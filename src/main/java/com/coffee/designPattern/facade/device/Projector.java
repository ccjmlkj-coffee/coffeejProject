package com.coffee.designPattern.facade.device;



/**
 * Created by jingbin on 2016/11/2.
 * 投影仪
 */

public class Projector {

    public void on() {
        System.out.println("Projector---打开投影仪");
    }

    public void off() {
        System.out.println("Projector---关闭投影仪");
    }

    public void close() {
        System.out.println("Projector---收起投影仪投影区");
    }

    public void open() {
        System.out.println("Projector---放下投影仪投影区");
    }
}
