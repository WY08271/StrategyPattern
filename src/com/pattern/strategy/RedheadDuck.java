package com.pattern.strategy;

import com.pattern.strategy.impl.FlyWithWin;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("red head duck");
    }

}
