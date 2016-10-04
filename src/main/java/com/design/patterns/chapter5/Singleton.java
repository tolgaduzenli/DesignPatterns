package com.design.patterns.chapter5;

/**
 * @author Tolga Duzenli on 04-Oct-2016.
 */
public class Singleton {

    public static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
