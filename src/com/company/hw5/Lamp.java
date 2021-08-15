package com.company.hw5;

public class Lamp {
    private boolean isOn;

    public void turnOn() {
        System.out.println("ON");
        this.isOn = true;
    }

    public void turnOff() {
        System.out.println("OFF");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

}
