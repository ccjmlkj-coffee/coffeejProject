package com.coffee.designPattern.bridge;

public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a red circle,radius:"+radius+",x:"+x+",y:"+y);
    }
}
