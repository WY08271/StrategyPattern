package com.pattern.strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("guaguagua~");
    }

    public abstract void display();

    private FlyingStragety flyingStragety;

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }

    public void fly() {
        flyingStragety.performFly();
    }
}
