package com.company;

import com.company.hw4.Cat;
import com.company.hw4.CatDecorator;
import com.company.hw4.RealCat;
import com.company.hw4.SuperMoveDecorator;
import com.company.hw5.Button;
import com.company.hw5.Lamp;
import com.company.hw5.SwitchInRoom;

public class Main {

    public static void main(String[] args) {
// Example hw4
//        Decorator
        Cat cat = new CatDecorator(new RealCat());
        cat.move();
        System.out.println(cat.say());

        cat = new SuperMoveDecorator(new CatDecorator(new RealCat()));
        cat.move();
        System.out.println(cat.say());

// Example hw3
//// Singleton
//        SingletonExample single = SingletonExample.getInstance();
//        System.out.println(single.getName("Ivan"));
//
//// Prototype
//        CloneExample ob1 = new CloneExample(5, 6, "green");
//        CloneExample ob2 = ob1.clone();
//        System.out.println(ob2.equals(ob1));
//        System.out.println(ob1);
//        System.out.println(ob2);
//
//// Builder
//        Cat cat = new CatBuilderExample().name("Tommy").color("White").age(5).build();
//        System.out.println(cat);
//        hw 5
        Lamp lamp = new Lamp();
        SwitchInRoom switchInRoom = new SwitchInRoom(lamp);
        Button button = new Button(switchInRoom);
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
