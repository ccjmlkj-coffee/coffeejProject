package com.coffee.designPattern.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyTest {
    public static void main(String[] args) {
        ImageProxy imageProxy = new ImageProxy("makaijianMp4");
        imageProxy.display();

        Set<String> matchLangSet1 = new HashSet<>();
        Set<String> matchLangSet2 = new HashSet<>();
        matchLangSet2.add("default");
        matchLangSet2.add("en");
        matchLangSet1.add("en");
        for (String var1 : matchLangSet1){
            System.out.println(var1);
            System.out.println(matchLangSet2.contains(var1));
        }
    }
}
