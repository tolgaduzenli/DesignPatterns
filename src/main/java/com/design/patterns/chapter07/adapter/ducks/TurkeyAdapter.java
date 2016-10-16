package com.design.patterns.chapter07.adapter.ducks;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
