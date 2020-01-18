package com.example.module.pagaz.base;

import com.github.rosti_il.jpms.VersionedService;

// Pagaz is a cannon shell in Hebrew
public interface Pagaz extends VersionedService {
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
