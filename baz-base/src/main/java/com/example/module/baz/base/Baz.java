package com.example.module.baz.base;

public interface Baz {
    /**
     * @since 1.0
     * */
    String getInfo();

    /**
     * @since 3.0
     * */
    default String getInfo2() {
        throw new RuntimeException("not implemented");
    }
}
