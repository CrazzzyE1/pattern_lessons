package com.company;

import com.company.hw3.Cat;
import com.company.hw3.CatBuilderExample;
import com.company.hw3.CloneExample;
import com.company.hw3.SingletonExample;

public class Main {

    public static void main(String[] args) {
// Example hw3
// Singleton
        SingletonExample single = SingletonExample.getInstance();
        System.out.println(single.getName("Ivan"));

// Prototype
        CloneExample ob1 = new CloneExample(5, 6, "green");
        CloneExample ob2 = ob1.clone();
        System.out.println(ob2.equals(ob1));
        System.out.println(ob1);
        System.out.println(ob2);

// Builder
        Cat cat = new CatBuilderExample().name("Tommy").color("White").age(5).build();
        System.out.println(cat);
    }
}
