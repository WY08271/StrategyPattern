package com.pattern.strategy;

import com.pattern.strategy.impl.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }

}
