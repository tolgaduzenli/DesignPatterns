package com.design.patterns.chapter02;

import com.design.patterns.chapter02.observer.CurrentConditionDisplay;
import com.design.patterns.chapter02.subject.WeatherData;

/**
 * @author Tolga Duzenli on 20-Sep-2016.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
