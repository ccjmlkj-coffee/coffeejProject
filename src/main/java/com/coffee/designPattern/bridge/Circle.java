package com.coffee.designPattern.bridge;

public class Circle extends Shape{
    public int radius;
    public int x;
    public int y;
    protected Circle(int radius,int x,int y,DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(this.radius,this.x,this.y);
    }
}
