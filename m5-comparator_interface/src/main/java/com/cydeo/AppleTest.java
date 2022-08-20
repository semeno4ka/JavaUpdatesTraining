package com.cydeo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(Color.GREEN,300));
        inventory.add(new Apple(Color.RED,150));
        inventory.add(new Apple(Color.GREEN,200));
        inventory.add(new Apple(Color.GREEN,250));

        //Comparator Interface approach

        //Comparator.comparing() static method
        Comparator<Apple> sortApple = comparing(((Apple apple)->apple.getWeight()));// need to simplify
        inventory.sort(sortApple);// does (o2,o1)->o1.compareTo(o2) in the background
        System.out.println(inventory);
        //or direct action passing
        inventory.sort(comparing(((Apple apple)->apple.getWeight())));
        //Or simplification
        Comparator<Apple> sortApple2 = comparing(Apple::getWeight);
        // we imported Class, thus no need to pass class name, just static method
        inventory.sort(sortApple2);// same as inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);







    }
}
