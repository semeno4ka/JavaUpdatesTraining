package com.cydeo.homeTask.apple;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintApple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(180, Color.RED));
        inventory.add(new Apple(280, Color.GREEN));
        inventory.add(new Apple(380, Color.RED));

        ApplePredicate appleLambda = apple -> "An apple of " + apple.getWeight() + "g.";
        prettyPrintApple(inventory, appleLambda);
        prettyPrintApple(inventory, apple -> "A " + apple.getColor() + " apple");
        // each apple gets print method unique implementation

        inventory.forEach(apple -> System.out.println(apple));// to print each without using the loop

        // Example for more than one line
        ApplePredicate fancyApple = apple -> { // you can specify implementation within Lambda
            String ch = apple.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch + " " + apple.getColor() + " apple";// if more than one line, curly braces required and return required as well
        };
        prettyPrintApple(inventory, fancyApple);



    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate) {
        for (Apple apple : inventory) { // the interface is responsible for ability to execute unique action
            String output = applePredicate.print(apple);
            System.out.println(output);
            //we check every apple and apply print method to each of the apple. However, specific implementation will be passed through Lambda
        }
    }


}
