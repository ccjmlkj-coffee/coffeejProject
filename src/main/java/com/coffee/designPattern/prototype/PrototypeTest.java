package com.coffee.designPattern.prototype;

import com.coffee.designPattern.prototype.impl.Circle;
import com.coffee.designPattern.prototype.impl.Rectangle;

public class PrototypeTest {

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();

        Circle circle = (Circle) shapeCache.shapeMap.get("circle");
        if (circle==null){
            shapeCache.loadShape();
            circle = (Circle) shapeCache.shapeMap.get("circle");
        }
        Rectangle rectangle = (Rectangle) shapeCache.shapeMap.get("rectangle");
        circle.draw();
        rectangle.draw();
    }
}
