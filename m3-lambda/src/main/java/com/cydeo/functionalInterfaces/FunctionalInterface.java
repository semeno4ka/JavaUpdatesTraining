package com.cydeo.functionalInterfaces;

import com.cydeo.homeTask.apple.Apple;
import com.cydeo.homeTask.apple.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
/*  FYI:  Anonymus class
        ApplePredicate ap = new ApplePredicate() {   CREATES MIDDLE LAYER CLASS, NOT OBJECT
            @Override
            public boolean print(Apple apple) {
                return apple.getWeight()>200;
            }
        };
 */
        System.out.println("           PREDICATE              ");
        Predicate<Integer> lessThan = i-> i<18;//pass object, return boolean; ture/false
        System.out.println(lessThan.test(5));//true
        System.out.println();

        System.out.println("            CONSUMER            ");
        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(10);
        System.out.println();

        System.out.println("           BiCONSUMER            ");
        BiConsumer<Integer,Integer> addTwo =(x,y)-> System.out.println(x+y);
        addTwo.accept(1,2);
        System.out.println();

        System.out.println("           FUNCTION            ");
        Function<String,String> fun = s->"Hello "+s;
        System.out.println(fun.apply("Joe"));
        Function<Integer,Integer> in=i->2-i;// interesting implementation with Integers
        System.out.println(in.apply(3));
        System.out.println();

        System.out.println("           BiFUNCTION            ");
        BiFunction<Integer,Integer,Integer> func=(x,y)-> x+y;
        System.out.println(func.apply(6,6));
        System.out.println();

        System.out.println("           SUPPLIER            ");
        Supplier<Double> randomValue = ()-> Math.random(); //since there is no parameter, it can retuen anyhting you specify according to data type you chosen
        System.out.println(randomValue.get());
        Supplier<String> randomS=()->"Anything";
        System.out.println(randomS.get());



    }
}
