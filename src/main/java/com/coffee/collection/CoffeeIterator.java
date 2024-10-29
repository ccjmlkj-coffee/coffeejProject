package com.coffee.collection;

import java.util.function.Consumer;

public interface CoffeeIterator<T>extends Iterable<T> {

    @Override
    default void forEach(Consumer<? super T> action) {
        for (T v:this){
            action.accept(v);
        }
        Iterable.super.forEach(action);
    }
}
