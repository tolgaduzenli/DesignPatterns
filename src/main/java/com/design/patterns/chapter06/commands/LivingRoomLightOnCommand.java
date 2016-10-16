package com.design.patterns.chapter06.commands;

import com.design.patterns.chapter06.devices.Light;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class LivingRoomLightOnCommand implements Command {
    Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
