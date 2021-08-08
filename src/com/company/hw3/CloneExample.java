package com.company.hw3;

public class CloneExample {
    private int size;
    private int speed;
    private String color;

    public CloneExample(int size, int speed, String color) {
        this.size = size;
        this.speed = speed;
        this.color = color;
    }

    public CloneExample clone() {
        return new CloneExample(this.size, this.speed, this.color);
    }

    public boolean equals(CloneExample obj) {
        return this.color.equals(obj.color) && this.size == obj.size && this.speed == obj.speed;
    }

    @Override
    public String toString() {
        return "CloneExample{" +
                "size=" + size +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
