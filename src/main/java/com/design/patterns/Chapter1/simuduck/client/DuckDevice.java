package com.design.patterns.Chapter1.simuduck.client;

import com.design.patterns.Chapter1.simuduck.quack.QuackBehavior;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class DuckDevice {

    private QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
