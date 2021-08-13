package com.company.hw4;

public class RealCat implements Cat{
    private String name;
    @Override
    public String say() {
        return "Mow-mow";
    }

    @Override
    public void move() {
        System.out.println("I'm too lazy, I'd rather sleep");
    }
}
