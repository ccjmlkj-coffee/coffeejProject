package com.coffee.designPattern.factory.classes;

import com.coffee.designPattern.factory.interfaces.Goods;

public abstract class SuperMarket {
    public abstract Goods sellGoods(String type);
}
