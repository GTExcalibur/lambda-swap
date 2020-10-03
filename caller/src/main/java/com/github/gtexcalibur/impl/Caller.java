package com.github.gtexcalibur.impl;

import com.github.gtexcalibur.API;

public class Caller {

    public void start() {
        new API().foo(System.out::println);
    }
}
