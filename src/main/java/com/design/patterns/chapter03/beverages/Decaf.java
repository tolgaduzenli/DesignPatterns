package com.design.patterns.chapter03.beverages;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public class Decaf extends Beverage {

    private final String description;

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
