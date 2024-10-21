package com.coffee.designPattern.proxy;

public class ImageProxy implements Image{
    RealImage realImage;
    public ImageProxy(String fileName){
        RealImage img = new RealImage(fileName);
        this.realImage = img;

    };
    @Override
    public void display() {
       realImage.display();
    }
}
