package com.design.patterns.chapter4.version1.products;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tolga Duzenli on 27-Sep-2016.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes for 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza in diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }
}
