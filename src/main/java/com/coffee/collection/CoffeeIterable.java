package com.coffee.collection;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public interface CoffeeIterable<T> {

    /**
     * 获取迭代器
     * @return 集合迭代器
     */
    Iterator<T> iterator();






}
