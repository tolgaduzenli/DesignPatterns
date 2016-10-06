package com.design.patterns.chapter6.commands;

import com.design.patterns.chapter6.devices.Hottub;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class HottubOffCommand implements Command{
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
