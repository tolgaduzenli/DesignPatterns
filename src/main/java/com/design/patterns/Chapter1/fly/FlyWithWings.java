package com.design.patterns.Chapter1.fly;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with wings.");
    }
}
