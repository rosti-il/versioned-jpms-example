package com.example.module.baz.base;

public interface Baz {
    void printMe();
    default void printMe2() {
        throw new RuntimeException("not implemented");
    }
}
