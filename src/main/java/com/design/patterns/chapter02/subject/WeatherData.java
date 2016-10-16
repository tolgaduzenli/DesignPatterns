package com.design.patterns.chapter02.subject;

import com.design.patterns.chapter02.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tolga Duzenli on 20-Sep-2016.
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> {
            o.update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
