package com.design.patterns.chapter3;

import com.design.patterns.chapter3.beverages.Beverage;
import com.design.patterns.chapter3.beverages.DarkRoast;
import com.design.patterns.chapter3.beverages.Espresso;
import com.design.patterns.chapter3.beverages.HouseBlend;
import com.design.patterns.chapter3.condiments.Mocha;
import com.design.patterns.chapter3.condiments.Soy;
import com.design.patterns.chapter3.condiments.Whip;

/**
 * @author Tolga Duzenli on 23-Sep-2016.
 */
public class ServingStarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Beverage.Size.GRANDE);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
