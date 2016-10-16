package com.design.patterns.chapter02.observer;

import com.design.patterns.chapter02.subject.Subject;

/**
 * @author Tolga Duzenli on 20-Sep-2016.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature+ " F degrees and "+ humidity+" % humidity");
    }
}
