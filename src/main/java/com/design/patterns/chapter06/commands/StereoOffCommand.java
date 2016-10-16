package com.design.patterns.chapter06.commands;

import com.design.patterns.chapter06.devices.Stereo;

/**
 * @author Tolga Duzenli on 06-Oct-2016.
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
