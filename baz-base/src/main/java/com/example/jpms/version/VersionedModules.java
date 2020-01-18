package com.example.jpms.version;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.MODULE)
public @interface VersionedModules {
    String[] modules();
}
