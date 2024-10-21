package com.coffee.designPattern.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        ImageProxy imageProxy = new ImageProxy("makaijianMp4");
        imageProxy.display();
    }
}
