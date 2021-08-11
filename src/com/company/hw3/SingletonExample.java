package com.company.hw3;

// My Singleton
public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // for test
    public String getName(String name) {
        return "Hello, ".concat(name).concat("!");
    }
}
