package com.company.hw4;

public class SuperMoveDecorator extends CatDecorator{

    public SuperMoveDecorator(Cat wrapper) {
        super(wrapper);
    }

    @Override
    public String say() {
        comeHere();
        return super.say();
    }

    @Override
    public void move() {
        showMouse();
        super.move();
    }

    private void showMouse() {
        System.out.println("pee-pe-pee");
    }

    private void comeHere() {
        System.out.println("kees-kees");
    }
}
