package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {


        //Intermediate Operations
        List<Integer> list= Arrays.asList(1,2,3,2,4);
        list.forEach(System.out::println);
        // if you do not close the stream, you will not be able to test it

        System.out.println("                  FILTER                    ");
        //FILTER: forLoop and filter inside
        list.stream()
                .filter(i->i%2==0) // filters which meet condition Filter belongs to Stream
                .forEach(System.out::println);// print those filtered   ForEach belongs to Iterable, thus closes the stream

        System.out.println("                  DISTINCT                    ");
        // Distinct: returns unique elements
        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);
        //ALl the intermediate operations return Stream until you close it the flow continues

/*
Can also be like this, but not the best approach
 Stream<Integer> str = list.stream()
                .filter(i->i%2==0)
                .distinct()
  str.forEach(System.out::println);
  it abrupt the flow
 */

        System.out.println("                  LIMIT                    ");
        //Limit: limits the size to your specification
        list.stream()
                .filter(i->i%2==0)
                .limit(1)// returns the 1 st matching
                .forEach(System.out::println);

        System.out.println("                  SKIP                    ");
        //Skip: skips specified element
        list.stream()
                .filter(i->i%2==0)
                .skip(1)// skips the 1st even, jumps to printing from second even
                .forEach(System.out::println);

        System.out.println("                  Map                    ");
       //Map: takes a function as argument,applies to each element and return mapping to new element. WE DO SMTH TO OBJECT,change it
        list.stream()
                .filter(i->i%2==0)
                .map(i->i*3)
                .forEach(System.out::println);

        System.out.println("                  FLATMAP                    ");
        //FlatMap:
        /*
        FlatMAp vs Map:
        map(): takes Stream<T> as input and return Stream<R>
        It is mapper functions which produces single value for each input value. ONE-TO-ONE mapping

        flapMap(): takes Stream<Stream<T>> (stream of stream) as an input and returns Stream<R>. ONE-TO-MANY mapping

Stream.of(1,2,3,4) ->(f.e. double and return) [2,4,6,8]
[ [1,2] [3,4] [5,6] [7,8] ]-> a stream of stream will return [1,2,3,4,5,6,7,8] flatMap all streams combined as one

         */





    }
}
