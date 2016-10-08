package com.design.patterns.chapter7.adapter.ducks;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
