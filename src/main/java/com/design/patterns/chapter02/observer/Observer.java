package com.design.patterns.chapter02.observer;

/**
 * @author Tolga Duzenli on 20-Sep-2016.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
