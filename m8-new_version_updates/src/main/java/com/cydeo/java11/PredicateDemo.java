package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> even= i->i%2==0;
        Predicate<Integer> odd= i->i%2!=0;
        //Before
        List<Integer> evenList=list.stream().filter(even).collect(Collectors.toList());
        List<Integer> oddList=list.stream().filter(odd).collect(Collectors.toList());
        //Now
        Predicate<Integer> oddNew=Predicate.not(even);// can use not and method
        //.filter(Predicate.not(even))
        // If you import static Predicate, you can use 'not' directly, without Predictae.not, just not(even)


    }
}
