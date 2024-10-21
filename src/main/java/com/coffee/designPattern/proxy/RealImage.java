package com.coffee.designPattern.proxy;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;

    }

    @Override
    public void display() {
        loadFromDisk();
        System.out.println("pre ok , to display img file!");
    }

    public void loadFromDisk(){
        System.out.println("load content from disk,name is :"+ fileName);
    }
}
