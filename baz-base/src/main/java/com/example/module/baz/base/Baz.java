package com.example.module.baz.base;

import com.github.rosti_il.jpms.VersionedService;

public interface Baz extends VersionedService {
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
