package com.coffee.designPattern.factory;

import com.coffee.designPattern.factory.classes.Factory;
import com.coffee.designPattern.factory.classes.KaijianSuperMarket;
import com.coffee.designPattern.factory.interfaces.Goods;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Goods banana = factory.productGoodsByType("banana");
        Goods apple = factory.productGoodsByType("apple");
        Goods orange = factory.productGoodsByType("orange");
        if (orange != null){
            orange.use();
        }else {
            System.out.println("factory can not product orange");
        }
        banana.use();
        apple.use();
        KaijianSuperMarket kaijianSuperMarket = new KaijianSuperMarket(factory);
        kaijianSuperMarket.sellGoods("apple").use();
    }
}
