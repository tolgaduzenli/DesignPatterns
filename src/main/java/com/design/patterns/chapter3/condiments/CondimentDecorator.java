package com.design.patterns.chapter3.condiments;

import com.design.patterns.chapter3.beverages.Beverage;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
