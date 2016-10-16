package com.design.patterns.chapter06.commands;

import com.design.patterns.chapter06.devices.GarageDoor;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
