package com.coffee.classLoad;

//双亲委派及其，在本项目中存在String对象，会先加载本项目的String对象，直接返回，不特定引用的java.lang的话不会加载到String
import java.lang.String;

public class LoadClassTest {

    public static void main(String[] args) {
        com.coffee.classLoad.String str = new com.coffee.classLoad.String();
        str.getMkj();
        getString();
    }

    public static String getString(){
        System.out.println(new String());
        return new String();
    }
}
