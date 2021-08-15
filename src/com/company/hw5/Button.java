package com.company.hw5;

public class Button {
    private SwitchInRoom switchInRoom;

    public Button(SwitchInRoom switchInRoom) {
        this.switchInRoom = switchInRoom;
    }

    public void press() {
        switchInRoom.press();
    }
}
