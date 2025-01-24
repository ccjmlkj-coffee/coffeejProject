package com.coffee.png;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class testCase {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                for (int i1 = 0; i1 < 20; i1++) {
                    System.out.println("cur:"+i1);
                    if (i1 == 5){
                        break;
                    }
                }
                System.out.println("first:"+i);
            }
            Math.round(5.5);
            System.out.println(Integer.MAX_VALUE+Integer.MAX_VALUE);

//            Thumbnails.of(new File("/Users/makaijian/Desktop/broadcast_banner_6.png"))
//                    .outputFormat("jpg")
//                    .scale(1.0)
//                    .toFile(new File("/Users/makaijian/Desktop/broadcast_banner_6.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
