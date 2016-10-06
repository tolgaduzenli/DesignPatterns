package com.design.patterns.chapter6.commands;

import com.design.patterns.chapter6.devices.Stereo;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
