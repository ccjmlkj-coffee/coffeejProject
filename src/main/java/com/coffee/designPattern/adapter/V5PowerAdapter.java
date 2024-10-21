package com.coffee.designPattern.adapter;

/**
 * 适配器模式，将一种数据类型转化成另一种数据类型
 */
public class V5PowerAdapter implements V5InputPower {

    public int v220power;

    public V5PowerAdapter(V220InputPower v220Power) {
        v220power = v220Power.provideV220Power();
    }


    @Override
    public int providePower() {

        return v220power/44;
    }
}
