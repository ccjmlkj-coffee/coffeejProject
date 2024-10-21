package com.coffee.designPattern.builder;

public class Product {
    public String name;
    public String type;

    public Product(){

    }

    public Product(String name,String type){
        this.name  = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }
}
