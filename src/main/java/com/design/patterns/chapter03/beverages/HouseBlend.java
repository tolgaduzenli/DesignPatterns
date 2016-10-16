package com.design.patterns.chapter03.beverages;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public class HouseBlend extends Beverage {

    private final String description;

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public String getDescription() {
        return description;
    }
    

    @Override
    public double cost() {
        return 0.89;
    }
}
