package com.coffee.collection;

import com.coffee.util.NumberUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CoffeeArrayList<T> {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.getFirst());
//        int i =  list.set(4,7);
//        System.out.println(i);
//
//        list.add(0,5);
//        list.add(2,8);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>(10);
        list2.add(6);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        List<String> list3= new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list3.add("makaijian");
        list4.add("makaijian");
        list3.add("fangjiahui");
        list4.add("fangjiahui");
        System.out.println(list3.hashCode());
        System.out.println(list4.hashCode());


        System.out.println(list.hashCode());
        System.out.println(list.hashCode());

//        System.out.println(list.get(5).hashCode());
    }
}
