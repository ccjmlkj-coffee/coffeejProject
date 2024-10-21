package com.coffee.designPattern.decorator.gem;

import com.coffee.designPattern.decorator.IEquip;

public class BlueGemDecorator implements IEquipDecorator  {
    IEquip iEquip;
    public BlueGemDecorator(IEquip iEquip){
        this.iEquip = iEquip;
    }

    @Override
    public int calculateAttack() {
        return iEquip.calculateAttack() + 7;
    }

    @Override
    public void printDesc() {
        iEquip.printDesc();
        System.out.println("附加了蓝宝石，实际攻击："+calculateAttack());
    }
}
