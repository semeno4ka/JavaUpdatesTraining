package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;
import com.cydeo.Task.Type;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsMethods {
    public static void main(String[] args) {


        /*How to get changed source-> through Collectors
         in stream the original data does not change, to extract data after manipulation you should use Collectors (utility class)
        Stream.collect() accesses all the static methods from Collector utility
        Collector methods are static and final and return collector instance
        to call Collector class in stream, you should first call .collect(Collectors....)

        */
        System.out.println("               toCollection()                                  ");
        //toCollection(Supplier) : used to create a Collection using Collector
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
       List<Integer> numberList= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));// the result is assigned to new ArrayList, you can also assign it

        System.out.println(numberList);
        Set<Integer> numberList2= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));//doesn't allow dups
        System.out.println(numberList2);

        System.out.println("               toList()                                  ");
        //toLIst(): returns a Collector interface that gathers the input data into a new List
        List<Integer> numberList3=numbers.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toList());
        System.out.println(numberList3);
        //same as toCollection, but shorter

        System.out.println("               toSet()                                  ");
//toSet(): returns a Collector interface that gathers the input data into a new Set
        Set<Integer> numberList4=numbers.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toSet());
        System.out.println(numberList4);

        System.out.println("               toMap()                                  ");
//toMap(Function,Function): returns a Collector interface that gathers the input data into a new Map
        Map<String,Integer> dishMap=DishData.getAll().stream()       //   KEY           VALUE
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("               summingInt()                                  ");
        //summingInt(toIntFUnction): returns a Collector that produces the sum of an Integer-valued function
        int totalCal=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(totalCal);

        System.out.println("               counting()                                  ");
//counting(): returns a Collector that counts the number of elements
        long evenCount=numbers.stream().filter(x->x%2==0).collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("               average()                                  ");
//averagingInt(toIntFunction): returns tge average of the integer passed values
        Double calorieAverage=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("               joining()                                  ");
        //joining(): is used to joining various elements of a character or string into a single object(concatination)
        List<String> courses= Arrays.asList("Java","JS","TS");
        String str=courses.stream()
                .collect(Collectors.joining(","));// put "," in between each object
        System.out.println(courses);//[Java, JS, TS]
        System.out.println(str);//Java,JS,TS

        System.out.println("               partitioningBy()                                  ");
// partitioningBy(): is used to partition a stream of objects(or a set of elements)based on the given predicate
Map<Boolean,List<Dish>> vegetarianOption=DishData.getAll().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(vegetarianOption);// returns a Boolean and List of Dish of dishes which are TRUE and FALSE

        System.out.println("               groupingBy()                                  ");
        //groupingBy(): is used for grouping objects by some criteria and storing results in Map instance
        Map<Type,List<Dish>> dishType=DishData.getAll().stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);// returns map<Type(whatever you are looking for), List of <Dish>> .
        // The output is grouped based on the criteria

    }
}
