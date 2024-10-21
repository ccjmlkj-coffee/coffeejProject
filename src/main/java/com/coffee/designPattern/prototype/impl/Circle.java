package com.coffee.designPattern.prototype.impl;

import com.coffee.designPattern.prototype.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("i am a circle,draw a circle!");
    }
}
