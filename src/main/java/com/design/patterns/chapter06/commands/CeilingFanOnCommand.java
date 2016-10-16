package com.design.patterns.chapter06.commands;

import com.design.patterns.chapter06.devices.CeilingFan;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }
}
