package com.company.hw5;

public class SwitchInRoom implements Switch {
    private Lamp lamp;

    public SwitchInRoom(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void press() {
        if (lamp.isOn()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
