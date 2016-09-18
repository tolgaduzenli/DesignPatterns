package com.design.patterns.Chapter1.quack;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
