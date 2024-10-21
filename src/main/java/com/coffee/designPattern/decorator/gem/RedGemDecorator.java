package com.coffee.designPattern.decorator.gem;

import com.coffee.designPattern.decorator.IEquip;

public class RedGemDecorator implements IEquipDecorator{
    IEquip iEquip;

    public RedGemDecorator(IEquip iEquip){
        this.iEquip = iEquip;
    }
    @Override
    public int calculateAttack() {
        return iEquip.calculateAttack() + 9;
    }

    @Override
    public void printDesc() {
        iEquip.printDesc();
        System.out.println("附加了红宝石，实际攻击："+calculateAttack());
    }
}
