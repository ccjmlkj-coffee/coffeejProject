package com.coffee.designPattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getAProduct();
        System.out.println(product.name + "--"+product.type);
        Product product1 = director.getBProduct();
        System.out.println(product1.name + "--"+product1.type);
    }
}
