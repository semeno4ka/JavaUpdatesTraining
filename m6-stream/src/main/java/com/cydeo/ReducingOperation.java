package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingOperation {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int sum=0;//initial value
        for(int number: numbers){
          sum=sum+number;          // this is the idea behind REDUCE method
        }
        System.out.println(sum);//21
      //SAME THING!!
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);//21

// Find total calories
        int totalCalories= DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(0,(a,b)->a+b);// CAN BE .reduce(Integer::sum)
        System.out.println(totalCalories);

        int totalCalories2= DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)->a+b)
                .get();
        System.out.println(totalCalories);


        System.out.println("           MAX AND MIN WITH REDUCE            ");
        Optional<Integer>numMin=numbers.stream().reduce(Integer::min); // DOUBLE COLON INTEGRATION
        Optional<Integer>numMax=numbers.stream().reduce(Integer::max);
        Optional<Integer>numSum=numbers.stream().reduce(Integer::sum);
        System.out.println(numMax.get());//9
        System.out.println(numMin.get());//3
        System.out.println(numSum.get());//21

        System.out.println("           MAX AND MIN WITH REDUCE            ");
        //how many of items total or those that match criteria
        long count=DishData.getAll().stream().count();
        System.out.println(count);// 9 dishes total



    }
}
