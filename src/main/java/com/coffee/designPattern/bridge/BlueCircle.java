package com.coffee.designPattern.bridge;

import com.alibaba.fastjson.JSONWriter;

public class BlueCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a blue circle,radius:"+radius+",x:"+x+",y:"+y);

    }
}
