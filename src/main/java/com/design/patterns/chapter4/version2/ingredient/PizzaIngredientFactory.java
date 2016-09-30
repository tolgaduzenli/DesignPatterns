package com.design.patterns.chapter4.version2.ingredient;

/**
 * @author Tolga Duzenli on 30-Sep-2016.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
