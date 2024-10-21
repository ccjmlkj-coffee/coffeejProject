package com.coffee.designPattern.flyweight;


public class FlyWeightTest {

    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle = (Circle) ShapeFactory.getShape("red");
        circle.draw();
    }
}
