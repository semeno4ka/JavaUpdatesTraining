package com.cydeo;

import java.util.Arrays;
import java.util.List;

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


    }
}
