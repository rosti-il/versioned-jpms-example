package com.example.module.bar;

import com.example.module.baz.base.Baz;
import com.github.rosti_il.jpms.VersionedModuleProvider;

public class Bar {
    public static void printMe() {
        Baz baz = VersionedModuleProvider.getService();

        System.out.println("Bar calls " + baz.getInfo());
        System.out.println("Bar calls " + baz.getInfo2());

        System.out.println(baz.getClass());
        System.out.println("loaded by " + baz.getClass().getClassLoader());
        System.out.println("from module " + baz.getClass().getModule().getDescriptor().toNameAndVersion());    }
}
