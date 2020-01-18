package com.example.module.bar;

import com.example.module.baz.base.Baz;
import com.example.module.baz.base.BazProvider;

public class Bar {
    public static void printMe() {
        Baz baz = BazProvider.getBaz("baz-3.1.jar", "baz");

        System.out.println("Bar calls " + baz.getInfo());
        System.out.println("Bar calls " + baz.getInfo2());

        System.out.println(baz.getClass());
        System.out.println("loaded by " + baz.getClass().getClassLoader());
        System.out.println("from module " + baz.getClass().getModule().getDescriptor().toNameAndVersion());    }
}
