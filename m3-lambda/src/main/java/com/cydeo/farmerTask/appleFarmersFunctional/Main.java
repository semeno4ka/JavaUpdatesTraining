package com.cydeo.farmerTask.appleFarmersFunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Apple> appleStock=new ArrayList<>();
        appleStock.add(new Apple(Color.GREEN,300));
        appleStock.add(new Apple(Color.RED,100));
        appleStock.add(new Apple(Color.GREEN,200));
        appleStock.add(new Apple(Color.RED,50));

        System.out.println(filterApples(appleStock,apple -> apple.getWeight()>200));
        System.out.println("                       ");
        System.out.println(filterApples(appleStock,apple -> apple.getColor().equals(Color.GREEN)));




    }

    private static List<Apple> filterApples(List<Apple> appleStock, Predicate<Apple> p){//  ApplePredicate looking for object
        List<Apple> result = new ArrayList<>();

        for(Apple apple: appleStock){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
