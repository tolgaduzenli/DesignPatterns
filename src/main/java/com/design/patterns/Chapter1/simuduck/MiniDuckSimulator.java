package com.design.patterns.Chapter1.simuduck;

import com.design.patterns.Chapter1.simuduck.client.Duck;
import com.design.patterns.Chapter1.simuduck.client.DuckDevice;
import com.design.patterns.Chapter1.simuduck.client.MallardDuck;
import com.design.patterns.Chapter1.simuduck.fly.FlyWithWings;
import com.design.patterns.Chapter1.simuduck.quack.FakeQuack;
import com.design.patterns.Chapter1.simuduck.quack.Quack;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //Hunter uses Duck Devices for fake quack
        DuckDevice duckDevice = new DuckDevice();
        duckDevice.setQuackBehavior(new FakeQuack());
        duckDevice.performQuack();
    }
}
