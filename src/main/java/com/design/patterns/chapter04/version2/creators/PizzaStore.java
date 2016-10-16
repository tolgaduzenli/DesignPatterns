package com.design.patterns.chapter04.version2.creators;


import com.design.patterns.chapter04.version2.products.Pizza;

/**
 * @author Tolga Duzenli on 27-Sep-2016.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
