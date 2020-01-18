package com.example.module.application;

import com.example.module.bar.Bar;
import com.example.module.foo.Foo;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello from the Application");
        System.out.println();

        Foo.printMe();
        System.out.println();

        Bar.printMe();
    }
}
