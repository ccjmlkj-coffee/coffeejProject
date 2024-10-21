package com.coffee.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        final Integer ans = 0;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(e->{
            int opI = ans;
            opI += e;
            System.out.println(opI);
        });
        System.out.println(ans);
        final List<String> list1 = Arrays.asList("23");
        list1.add("22");
        System.out.println(list1);

    }
}
