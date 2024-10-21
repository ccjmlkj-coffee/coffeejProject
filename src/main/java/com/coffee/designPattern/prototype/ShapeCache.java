package com.coffee.designPattern.prototype;

import com.coffee.designPattern.prototype.impl.Circle;
import com.coffee.designPattern.prototype.impl.Rectangle;

import java.util.Hashtable;

public class ShapeCache {
    public Hashtable<String,Shape> shapeMap = new Hashtable<>();


    public void loadShape(){
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put("circle",circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId(2);
        shapeMap.put("rectangle",rectangle);
    }
}
