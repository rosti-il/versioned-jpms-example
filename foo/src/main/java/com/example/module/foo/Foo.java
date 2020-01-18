package com.example.module.foo;

import com.example.module.baz.base.Baz;
import com.example.module.pagaz.base.Pagaz;
import com.github.rosti_il.jpms.VersionedModuleProvider;

public class Foo {
    public static void printMe() {
        Baz baz = VersionedModuleProvider.getService(Baz.class);
        Pagaz pagaz = VersionedModuleProvider.getService(Pagaz.class);

        System.out.println("Foo calls " + baz.getInfo());
//        System.out.println("Foo calls " + baz.getInfo2()); // Exception thrown!!

        System.out.println(baz.getClass());
        System.out.println("loaded by " + baz.getClass().getClassLoader());
        System.out.println("from module " + baz.getClass().getModule().getDescriptor().toNameAndVersion());

        System.out.println();

        System.out.println("Foo calls " + pagaz.getInfo());

        System.out.println(pagaz.getClass());
        System.out.println("loaded by " + pagaz.getClass().getClassLoader());
        System.out.println("from module " + pagaz.getClass().getModule().getDescriptor().toNameAndVersion());
    }
}
