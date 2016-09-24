package com.design.patterns.chapter3.beverages;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public class DarkRoast extends Beverage {

    private final String description;

    public DarkRoast() {
        this.description = "DarkRoast";
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
