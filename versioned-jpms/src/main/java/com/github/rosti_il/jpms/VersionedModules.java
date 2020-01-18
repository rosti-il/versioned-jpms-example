package com.github.rosti_il.jpms;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface VersionedModules {
    String[] modules();
}
