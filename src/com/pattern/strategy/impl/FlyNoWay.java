package com.pattern.strategy.impl;

import com.pattern.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

    public void performFly() {
        System.out.println("fly no way");
    }
}