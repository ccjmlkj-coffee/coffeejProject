package com.coffee.designPattern.factory.classes;

import com.coffee.designPattern.factory.interfaces.Goods;
import com.coffee.designPattern.factory.interfaces.SimpleFactory;

import java.util.Objects;

public class Factory implements SimpleFactory {
    @Override
    public Goods productGoodsByType(String type) {
        if (Objects.equals(type, "banana")){
            return new Banana();
        }
        if (Objects.equals(type, "apple")){
            return new Apple();
        }
        return null;
    }
}
