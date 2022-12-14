package com.cydeo.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparing;
public class Task2 {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        System.out.println("LESS THAN 400: name, calorie");
        DishData.getAll().stream()
        .filter(dish->dish.getCalories()<400)
                .map(dish -> dish.getName()+":"+dish.getCalories())// if needed just a name, could go with::
                // .map(Dish::getName)
        .forEach(System.out::println);
        System.out.println("EACH DISH NAME LENGTH");
        DishData.getAll().stream()
                .map(dish->dish.getName()+":"+dish.getName().length())
                .forEach(System.out::println);
        /*
        Could be:
        .map(Dish::getName)
        .map(String::getLength)
        .forEach(System.out::println)
         */
        System.out.println("HIGH CALORIE >300: name, calorie");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()>300)
                .map(dish->dish.getName()+":"+dish.getCalories())
                .limit(3)
                .forEach(System.out::println);
        /*
         .filter(dish->dish.getCalories()>300)
         .map(Dish::getName)
         .limit(3)
         .forEach(System.out::println)

         */
        System.out.println("BELOW 400 SORTED:name,calorie");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))// comparing method must be imported or called through class name
                .map(dish -> dish.getName()+":"+ dish.getCalories())//It is no longer DISH stream, It is String stream.
                .forEach(System.out::println);//=> it is called TERMINAL OPERATION
        /*
          .filter(dish->dish.getCalories()<400)
          .sorted(comparing(Dish::getCalories)) could add .reversed() to get different order of Calorie
          .map(Dish::getName)
          .forEach(System.out::println);
         */




    }
}
