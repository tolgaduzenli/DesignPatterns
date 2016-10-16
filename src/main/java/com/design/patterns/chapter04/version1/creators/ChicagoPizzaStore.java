package com.design.patterns.chapter04.version1.creators;

import com.design.patterns.chapter04.version1.products.ChicagoStyleCheesePizza;
import com.design.patterns.chapter04.version1.products.Pizza;

/**
 * @author Tolga Duzenli on 27-Sep-2016.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
