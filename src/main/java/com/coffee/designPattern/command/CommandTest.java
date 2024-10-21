package com.coffee.designPattern.command;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        ControlPenal controlPenal = new ControlPenal();
        controlPenal.setCommand("offLight",new LightOffCommand(light));
        controlPenal.setCommand("onLight",new LightOnCommand(light));
        controlPenal.execute("offLight");
        controlPenal.execute("onLight");
        controlPenal.execute("23ss");
    }
}
