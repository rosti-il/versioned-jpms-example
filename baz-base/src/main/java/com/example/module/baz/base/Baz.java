package com.example.module.baz.base;

public interface Baz {
    String getInfo();
    default String getInfo2() {
        throw new RuntimeException("not implemented");
    }
}
