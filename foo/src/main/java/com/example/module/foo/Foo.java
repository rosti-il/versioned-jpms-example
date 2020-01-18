package com.example.module.foo;

import com.example.module.baz.base.Baz;
import com.example.module.baz.base.BazProvider;

public class Foo {
    public static void printMe() {
        Baz baz = BazProvider.getBaz("baz-2.1.jar", "baz");

        System.out.println("Foo calls " + baz.getInfo());
//        System.out.println("Foo calls " + baz.getInfo2()); // Exception thrown!!

        System.out.println(baz.getClass());
        System.out.println("loaded by " + baz.getClass().getClassLoader());
        System.out.println("from module " + baz.getClass().getModule().getDescriptor().toNameAndVersion());
    }
}
