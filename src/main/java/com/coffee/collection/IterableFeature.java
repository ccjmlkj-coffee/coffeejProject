package com.coffee.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class IterableFeature {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("makaijian");
        list.add("fangjiahui");
        list.add("feature");
        list.add("iterator");
        list.iterator().forEachRemaining((k)->{
            System.out.println(k);
        });
        Spliterator sep = list.spliterator();
        for (int i = 0; i < 100; i++) {
            sep.tryAdvance((k)->{
                System.out.println(k);
            });
        }

        Spliterator trySplit = sep.trySplit();
        System.out.println(trySplit);


//        Thread.sleep(1000);

    }
}
