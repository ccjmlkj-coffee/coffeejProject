package com.coffee.designPattern.builder;

public class ConCreteBuilder extends Builder{

    private Product product = new Product();
    @Override
    public void setPart(String name, String type) {
        product.name = name;
        product.type = type;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
