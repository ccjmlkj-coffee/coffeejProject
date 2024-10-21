package com.coffee;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 创建一个包含中英文的字符串列表
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("苹果");
        strings.add("香蕉");
        strings.add("sss");
        int[] arr = new int[5];


        // 创建一个 Collator 对象来执行排序
        Collator collator = Collator.getInstance(Locale.CHINA);

        // 使用 Collator 对字符串列表进行排序
        Collections.sort(strings, collator);

        // 打印排序结果
        for (String s : strings) {
            System.out.println(s);
        }

        String url = "https://www.huya.com/?hyaction=live&uid=%s&action_url=https%3A%2F%2Fwww.huya.com%3Fhyaction%3Ddynamic_dialog%26_dynamic_type%3Dh5%26%26_scene%3D1%26use_new_dialog%3D1%26_url";
        String groupUrl = "https://test-hd.huya.com/h5/private-community-helper/test/index.html?profileUid=1099531700038&groupId=227";
        String result = url.replace("%s","1099531700038");
//        String huyaAction = String.format(url, "1099531700038");
        System.out.println(result);


//        https://www.huya.com/?hyaction=live&uid=%s&action_url=https%3A%2F%2Fwww.huya.com%3Fhyaction%3Ddynamic_dialog%26_dynamic_type%3Dh5%26%26_scene%3D1%26use_new_dialog%3D1%26_url


    }
}