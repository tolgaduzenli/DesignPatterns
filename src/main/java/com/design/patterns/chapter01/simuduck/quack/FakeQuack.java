package com.design.patterns.chapter01.simuduck.quack;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.printf("Fake Quack for Hunters!");
    }
}
