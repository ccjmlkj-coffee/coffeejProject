package com.coffee.designPattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5InputPower v5InputPower = new V5PowerAdapter(new V220InputPower());
        System.out.println(mobile.inputPower(v5InputPower));

    }
}
