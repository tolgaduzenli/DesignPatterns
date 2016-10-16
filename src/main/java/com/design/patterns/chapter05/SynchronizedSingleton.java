package com.design.patterns.chapter05;

/**
 * @author Tolga Duzenli on 04-Oct-2016.
 */
public class SynchronizedSingleton {

    public static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
