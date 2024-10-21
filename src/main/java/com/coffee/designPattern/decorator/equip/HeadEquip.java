package com.coffee.designPattern.decorator.equip;

import com.coffee.designPattern.decorator.IEquip;

public class HeadEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public void printDesc() {
        System.out.println("一个头盔,攻击力："+calculateAttack());
    }
}
