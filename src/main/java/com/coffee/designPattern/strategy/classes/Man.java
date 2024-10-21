package com.coffee.designPattern.strategy.classes;

import com.coffee.designPattern.strategy.interfaces.IBehave;
import com.coffee.designPattern.strategy.interfaces.IView;

/**
 * 策略模式实体
 */
public class Man {
    String name;
    public IBehave iBehave;
    public IView iView;

    public Man(String name){
        this.name = name;
    }

    public Man ManBehave(IBehave iBehave){
        this.iBehave = iBehave;
        return this;//建造者模式应用
    }

    public Man ManView(IView iView){
        this.iView = iView;
        return this;//建造者模式应用
    }
}
