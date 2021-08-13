package com.company.hw4;

public class CatDecorator implements Cat {
    private Cat wrapper;

    public CatDecorator(Cat wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String say() {
        return wrapper.say();
    }

    @Override
    public void move() {
        wrapper.move();
    }
}
