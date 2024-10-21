package com.coffee.designPattern.decorator.equip;

import com.coffee.designPattern.decorator.IEquip;

public class HandEquip implements IEquip {

    @Override
    public int calculateAttack() {
        return 3;
    }

    @Override
    public void printDesc() {
        System.out.println("一个护腕，攻击力："+calculateAttack());
    }
}
