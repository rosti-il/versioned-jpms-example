package com.example.module.baz.impl;

import com.example.module.baz.base.Baz;

public class BazImpl implements Baz {
    @Override
    public void printMe() {
        System.out.println("I'm Baz version 3.1");
    }

    @Override
    public void printMe2() {
        System.out.println("I support versioning");
    }
}
