package com.example.module.baz.impl;

import com.example.module.baz.base.Baz;

public class BazImpl implements Baz {

    private String field;

    public BazImpl() {

    }

    public BazImpl(String field) {
        this.field = field;
    }

    @Override
    public String getInfo() {
        return "getInfo() of Baz version 3.1";
    }

    @Override
    public String getInfo2() {
        return "getInfo2() of Baz version 3.1";
    }
}
