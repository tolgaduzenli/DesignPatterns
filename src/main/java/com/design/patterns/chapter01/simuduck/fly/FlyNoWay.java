package com.design.patterns.chapter01.simuduck.fly;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
