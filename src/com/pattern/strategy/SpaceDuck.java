package com.pattern.strategy;

import com.pattern.strategy.impl.FlyWithRocket;

public class SpaceDuck extends Duck {

    public SpaceDuck(){
        super();
        super.setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("space duck");
    }
}
