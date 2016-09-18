package com.design.patterns.Chapter1.simuduck.client;

import com.design.patterns.Chapter1.simuduck.fly.FlyBehavior;
import com.design.patterns.Chapter1.simuduck.quack.QuackBehavior;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck() {

    }

    public void swim() {
        System.out.printf("All ducks float, even decoy ducks!");
    }


    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
