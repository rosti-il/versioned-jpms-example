package com.example.module.baz.impl;

import com.example.module.baz.base.Baz;

public class BazImpl implements Baz {
    @Override
    public void printMe() {
        System.out.println("I'm Baz version 2.1");
    }
}
