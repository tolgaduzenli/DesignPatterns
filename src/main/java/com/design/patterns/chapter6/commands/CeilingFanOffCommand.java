package com.design.patterns.chapter6.commands;

import com.design.patterns.chapter6.devices.CeilingFan;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
