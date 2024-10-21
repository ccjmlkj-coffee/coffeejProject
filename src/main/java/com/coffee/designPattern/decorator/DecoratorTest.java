package com.coffee.designPattern.decorator;

import com.coffee.designPattern.decorator.equip.HandEquip;
import com.coffee.designPattern.decorator.equip.HeadEquip;
import com.coffee.designPattern.decorator.gem.BlueGemDecorator;
import com.coffee.designPattern.decorator.gem.RedGemDecorator;

public class DecoratorTest {
    public static void main(String[] args) {
        HeadEquip headEquip = new HeadEquip();
        HandEquip handEquip = new HandEquip();
        System.out.println(headEquip.calculateAttack());
        System.out.println(handEquip.calculateAttack());
        headEquip.printDesc();
        handEquip.printDesc();
        System.out.println("---");

        BlueGemDecorator decorator = new BlueGemDecorator(headEquip);
        System.out.println(decorator.calculateAttack());
        decorator.printDesc();

        RedGemDecorator redGemDecorator = new RedGemDecorator(handEquip);
        System.out.println(redGemDecorator.calculateAttack());
        redGemDecorator.printDesc();


        System.out.println("----");
        BlueGemDecorator moreDecorator = new BlueGemDecorator( redGemDecorator);
        System.out.println(moreDecorator.calculateAttack());
        moreDecorator.printDesc();
    }
}
