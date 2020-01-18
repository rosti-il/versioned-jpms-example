package com.example.module.bar;

import com.example.module.baz.base.Baz;
import com.example.module.baz.base.BazProvider;

public class Bar {
    public static void printMe() {
        System.out.println("I'm Bar");

        Baz baz = BazProvider.getBaz("baz-3.1.jar", "baz");
        baz.printMe();
    }
}
