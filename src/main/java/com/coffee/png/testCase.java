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



            long startTime = System.currentTimeMillis();
            String s = "start";
            for (int i = 0; i < 10000; i++) {
                s = s+i;

            }
            System.out.println("first call time:"+(System.currentTimeMillis()-startTime));


            long tTime = System.currentTimeMillis();
            StringBuffer sb1 = new StringBuffer("start");
            for (int i = 0; i < 10000; i++) {
                sb1.append(i);
            }
            System.out.println("third call time:"+(System.currentTimeMillis()-tTime));

            long secondTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("start");
            for (int i = 0; i < 10000; i++) {
                sb.append(i);
            }
            System.out.println("second call time:"+(System.currentTimeMillis()-secondTime));



//            Thumbnails.of(new File("/Users/makaijian/Desktop/broadcast_banner_6.png"))
//                    .outputFormat("jpg")
//                    .scale(1.0)
//                    .toFile(new File("/Users/makaijian/Desktop/broadcast_banner_6.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
