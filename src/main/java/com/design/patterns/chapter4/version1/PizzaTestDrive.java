package com.design.patterns.chapter4.version1;

import com.design.patterns.chapter4.version1.creators.ChicagoPizzaStore;
import com.design.patterns.chapter4.version1.creators.NYPizzaStore;
import com.design.patterns.chapter4.version1.creators.PizzaStore;
import com.design.patterns.chapter4.version1.products.Pizza;

/**
 * @author Tolga Duzenli on 27-Sep-2016.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }


}
