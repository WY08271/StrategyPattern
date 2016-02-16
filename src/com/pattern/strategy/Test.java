package com.pattern.strategy;

public class Test {
    public static void main(String[] args){
        Duck duck = null;
//        duck = new MallardDuck();
//        duck = new RubberDuck();
//        duck = new BigYellowDuck();
        duck = new SpaceDuck();
        duck.display();
        duck.fly();
        duck.quack();
    }
}
