package com.design.patterns.Chapter1.quack;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
