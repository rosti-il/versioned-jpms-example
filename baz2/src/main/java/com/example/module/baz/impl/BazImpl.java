package com.example.module.baz.impl;

import com.example.module.baz.base.Baz;

public class BazImpl implements Baz {
    @Override
    public String getInfo() {
        return "getInfo() of Baz version 2.1";
    }
}
