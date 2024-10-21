package com.coffee.url;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UrlDeal {
    public static void main(String[] args) throws MalformedURLException {

        try {
            String urlString = "https://test-hd.huya.com/h5/private-community-helper/test/index.html?type=card";
            String encodedUrl = URLEncoder.encode(urlString, "UTF-8");
            System.out.println("Encoded URL: " + encodedUrl);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error encoding URL: " + e.getMessage());
        }
        List<Integer> sortList = new ArrayList<>();
        sortList.add(1);
        sortList.add(2);
        sortList.add(3);
        sortList.add(4);
        sortList.add(5);
        System.out.println(sortList.stream().sorted(Comparator.comparing(Integer::intValue))
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList()));
        System.out.println(sortList.stream().sorted(Comparator.comparing(Integer::intValue).reversed())
                .sorted(Comparator.comparing(e -> e>3))
                .collect(Collectors.toList()));

    }


}
