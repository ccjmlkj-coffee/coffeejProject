package com.coffee.designPattern.factory.classes;

import com.coffee.designPattern.factory.interfaces.Goods;
import com.coffee.designPattern.factory.interfaces.SimpleFactory;

public class KaijianSuperMarket extends SuperMarket {
    SimpleFactory simpleFactory;

    public KaijianSuperMarket(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }
    @Override
    public Goods sellGoods(String type) {
        return simpleFactory.productGoodsByType(type);
    }
}
