package com.design.patterns.chapter3.beverages;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public class Espresso extends Beverage {

    private final String description;

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
