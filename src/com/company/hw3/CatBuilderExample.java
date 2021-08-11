package com.company.hw3;

public class CatBuilderExample {
    private Cat cat = new Cat();

    public CatBuilderExample name(String name) {
        cat.setName(name);
        return this;
    }

    public CatBuilderExample color(String color) {
        cat.setColor(color);
        return this;
    }

    public CatBuilderExample age(int age) {
        cat.setAge(age);
        return this;
    }

    public Cat build() {
        return cat;
    }
}
