package com.coffee.designPattern.factory.classes;

import com.coffee.designPattern.factory.interfaces.Goods;

public class Apple implements Goods {
    @Override
    public void use() {
        System.out.println("i am a apple , i can to eat!");
    }
}
