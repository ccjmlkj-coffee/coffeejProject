package com.coffee.designPattern.strategy;

import com.coffee.designPattern.strategy.classes.*;

public class StrategyTest {
    public static void main(String[] args) {
        Man manOne = new Man("makaijian");
        manOne.ManBehave(new BehaveEat()).ManView(new ViewSuccess());
        System.out.println(manOne.iView.myView());
        System.out.println(manOne.iBehave.myBehave());
        Man manTwo =  new Man("fangjiahui");
        manTwo.ManView(new ViewWonderful()).ManBehave(new BeHaveDrink());
        System.out.println(manTwo.iBehave.myBehave());
        System.out.println(manTwo.iView.myView());
    }
}
