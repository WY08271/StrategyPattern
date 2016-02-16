package com.pattern.strategy;

import com.pattern.strategy.impl.FlyWithWin;

public class MallardDuck extends Duck {


    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }

}

