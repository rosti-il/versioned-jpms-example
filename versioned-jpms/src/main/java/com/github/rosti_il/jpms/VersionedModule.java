package com.github.rosti_il.jpms;

import java.lang.annotation.*;

/**
 * @author Rostislav Krasny
 * */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface VersionedModule {
    String name();
    String version();
}
