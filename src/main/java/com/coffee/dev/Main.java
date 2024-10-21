package com.coffee.dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Weight {
    private String name;
    private int weight;

    public Weight(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = getPersons(); // 替换为你自己的Person对象列表
        List<Weight> weights = getWeights(); // 替换为你自己的Weight对象列表

        Map<String, Integer> weightMap = weights.stream()
                .collect(Collectors.toMap(Weight::getName, Weight::getWeight));

        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparing(p -> weightMap.getOrDefault(p.getName(), 0), Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // 输出结果
        sortedPersons.forEach(System.out::println);
    }

    private static List<Person> getPersons() {
        // 返回你自己的Person对象列表
        // 注意：这里只是一个示例
//        return List.of(
//                new Person("John", 25),
//                new Person("Alice", 30),
//                new Person("Bob", 18)
//        );
        return null;
    }

    private static List<Weight> getWeights() {
        // 返回你自己的Weight对象列表
        // 注意：这里只是一个示例
//        return List.of(
//                new Weight("John", 85),
//                new Weight("Alice", 63),
//                new Weight("Bob", 72)
//        );
        return null;
    }
}
