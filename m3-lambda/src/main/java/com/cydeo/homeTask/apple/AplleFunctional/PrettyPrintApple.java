package com.cydeo.homeTask.apple.AplleFunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrettyPrintApple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(180, Color.RED));
        inventory.add(new Apple(280, Color.GREEN));
        inventory.add(new Apple(380, Color.RED));
        Consumer<Apple> display = apple-> System.out.println("A delicious "+apple.getColor()+" apple");
        display.accept(new Apple(180, Color.GREEN));
        System.out.println("------------------");
        prettyPrintApple(inventory,apple-> System.out.println("Delicious "+apple.getColor()+" apple"));
        //prettyPrintApple(inventory,apple -> apple.getColor().equals(Color.GREEN));
    }
// Predicate will be used, if I pass a boolean parameter and whatever turns out to return true, will be printed
    //Predicate will not customize my Print statement, it will filter apples,which meet parameter and print those

    public static void prettyPrintApple(List<Apple> inventory,Consumer<Apple> p) {
        for (Apple each : inventory) {
               p.accept(each);
           }
        }
        }

    /*
    Predicate will be used, if I pass a boolean parameter and whatever turns out to return true, will be printed
    Predicate will not customize my Print statement, it will filter apples,which meet parameter and print those

     prettyPrintApple(inventory,apple -> apple.getColor().equals(Color.GREEN));
      public static void prettyPrintApple(List<Apple> inventory,Predicate<Apple> p) {
        for (Apple each : inventory) {
           if(p.test(each)){
               System.out.println(each.toString());
           }
        }

     */



