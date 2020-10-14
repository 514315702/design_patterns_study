package com.org.command;

public class LightOffCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }
}
