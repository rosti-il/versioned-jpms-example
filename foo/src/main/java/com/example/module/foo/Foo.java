package com.example.module.foo;

import com.example.module.baz.base.Baz;
import com.example.module.baz.base.BazProvider;

public class Foo {
    public static void printMe() {
        System.out.println("I'm Foo");

        Baz baz = BazProvider.getBaz("baz-2.1.jar", "baz");
        baz.printMe();
    }
}
