package com.coffee.designPattern.prototype.impl;

import com.coffee.designPattern.prototype.Shape;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("i am a rectangle , draw a rectangle! ");
    }
}
