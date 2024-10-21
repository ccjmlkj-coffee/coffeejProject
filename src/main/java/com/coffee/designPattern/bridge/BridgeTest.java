package com.coffee.designPattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,10,10,new RedCircle());
        Circle buleCircle = new Circle(5,1,2,new BlueCircle());
        circle.draw();
        buleCircle.draw();
    }
}
