package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Optional;

public class FindingMatchingOperations {
    public static void main(String[] args) {

        System.out.println("                 ALL MATCH              ");
        //All Match: will check the stream and will bring all the data with matching our boolean requirement
        boolean isHealthy=DishData.getAll().stream()
                .allMatch(dish->dish.getCalories()<1000);// accepts Predicate Interface.Always check what kind of Lambda it accepts
        System.out.println(isHealthy);// returns true if !ALL! the dishes are less than 1000


        System.out.println("                 ANY MATCH                      ");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){// if there is something at least. not all
            System.out.println("The menu has vegetarian options");// isVegetarian is coming from Intellij it changes getVegetarian boolean to isVegetarian since it more understandable
        }

        System.out.println("                 NONE MATCH                ");
        boolean isHealthy2=DishData.getAll().stream().noneMatch(dish-> dish.getCalories()>=1000);
        System.out.println(isHealthy2);// it is true, that none of the dishes match the parameter

        System.out.println("                 FIND ANY               ");
        Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);// returns something matching. Better to use with get() to get regular time, not Optional
//Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]   VS  Dish(name=fries, vegetarian=true, calories=530, type=OTHER)
        System.out.println(dish.get());




    }
}
