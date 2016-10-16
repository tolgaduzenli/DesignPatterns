package com.design.patterns.chapter07.adapter.ducks;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
