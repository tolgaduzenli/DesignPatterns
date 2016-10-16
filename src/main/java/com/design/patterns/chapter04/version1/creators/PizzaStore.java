package com.design.patterns.chapter04.version1.creators;

import com.design.patterns.chapter04.version1.products.Pizza;

/**
 * @author Tolga Duzenli on 27-Sep-2016.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
