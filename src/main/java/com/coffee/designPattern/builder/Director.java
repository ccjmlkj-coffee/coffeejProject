package com.coffee.designPattern.builder;

public class Director {

    public Product getAProduct(){
        ConCreteBuilder conCreteBuilder = new ConCreteBuilder();
        conCreteBuilder.setPart("小猪","盖被");
        return conCreteBuilder.getProduct();
    }

    public Product getBProduct(){
        ConCreteBuilder conCreteBuilder = new ConCreteBuilder();
        conCreteBuilder.setPart("大猪","洗澡");
        return conCreteBuilder.getProduct();
    }
}
