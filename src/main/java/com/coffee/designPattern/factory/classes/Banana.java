package com.coffee.designPattern.factory.classes;

import com.coffee.designPattern.factory.interfaces.Goods;

public class Banana implements Goods {
    @Override
    public void use() {
        System.out.println("i am a banana , i can to eat too!");
    }
}
