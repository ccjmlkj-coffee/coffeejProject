package com.coffee.dev;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<MyObject> myObjects = Arrays.asList(
                new MyObject("A", 10),
                new MyObject("A", 20),
                new MyObject("A", 30),
                new MyObject("B", 15),
                new MyObject("B", 25),
                new MyObject("C", 5)
        ); // 替换为你自己的对象列表

        List<MyObject> result = myObjects.stream()
                .collect(Collectors.groupingBy(MyObject::getField1)) // 根据字段1分组
                .values()
                .stream()
                .map(list -> // 根据字段2排序
                        list.stream().max(Comparator.comparing(MyObject::getField2))
                        .orElse(null))
                .collect(Collectors.toList());

        // 输出结果
        result.forEach(System.out::println);
    }


    public static List<MyObject> getMyObjects = Arrays.asList(
            new MyObject("A", 10),
            new MyObject("A", 20),
            new MyObject("A", 30),
            new MyObject("B", 15),
            new MyObject("B", 25),
            new MyObject("C", 5)
    );
}

class MyObject {
    private String field1;
    private int field2;

    public MyObject(String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }
}