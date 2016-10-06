package com.design.patterns.chapter6.commands;

import com.design.patterns.chapter6.devices.Light;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
