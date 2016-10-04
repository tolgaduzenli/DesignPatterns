package com.design.patterns.chapter5;

/**
 * @author Tolga Duzenli on 04-Oct-2016.
 */
public class DoubleCheckedSingleton {

    private volatile static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

}
