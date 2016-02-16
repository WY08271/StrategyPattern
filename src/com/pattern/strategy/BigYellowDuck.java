package com.pattern.strategy;

import com.pattern.strategy.impl.FlyNoWay;

public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("big yellow duck");
    }

}
