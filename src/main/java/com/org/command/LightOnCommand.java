package com.org.command;

public class LightOnCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.on();
    }

    public void undo() {
        lightReceiver.off();
    }
}
