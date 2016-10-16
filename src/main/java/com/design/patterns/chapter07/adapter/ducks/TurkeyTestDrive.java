package com.design.patterns.chapter07.adapter.ducks;

/**
 * @author Tolga Duzenli on 07-Oct-2016.
 */
public class TurkeyTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i=0;i<10;i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
