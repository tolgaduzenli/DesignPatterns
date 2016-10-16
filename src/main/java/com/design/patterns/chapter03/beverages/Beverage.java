package com.design.patterns.chapter03.beverages;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public abstract class Beverage {
    public enum Size {
        TALL, GRANDE, VENTI
    }

    ;

    private Size size = Size.TALL;

    private String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}
