package com.design.patterns.chapter5;

/**
 * @author Tolga Duzenli on 04-Oct-2016.
 */
public class EagerlySingleton {

    private static EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton() {
    }

    public static EagerlySingleton getInstance() {
        return instance;
    }
}
