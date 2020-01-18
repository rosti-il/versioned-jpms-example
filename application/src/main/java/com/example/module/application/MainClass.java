package com.example.module.application;

import com.example.module.bar.Bar;
import com.example.module.foo.Foo;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello there from the Application");
        Foo.printMe();
        Bar.printMe();
    }
}
