package com.cydeo.farmerTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Apple> appleStock=new ArrayList<>();
        appleStock.add(new Apple(Color.GREEN,300));
        appleStock.add(new Apple(Color.RED,100));
        appleStock.add(new Apple(Color.GREEN,200));
        appleStock.add(new Apple(Color.RED,50));

        AppleWeightPredicate heavy = new AppleWeightPredicate();
        List<Apple> heavyApple = filterApples(appleStock, heavy);// one way to type
        List<Apple> greenApple = filterApples(appleStock,new AppleGreenColorPredicate());// 2nd way to type
        System.out.println(heavyApple);
        System.out.println(greenApple);




    }

    private static List<Apple> filterApples(List<Apple> appleStock, ApplePredicate applePredicate){//  ApplePredicate looking for object
        List<Apple> result = new ArrayList<>();

        for(Apple apple: appleStock){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
