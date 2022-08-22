package com.cydeo.java9;

import java.util.*;
import java.util.stream.Collectors;

public class FactoryMethods {
    public static void main(String[] args) {

        /*
        Factory methods were introduced to create immutable List,Set,Map
        (before Java 9 there was unmodifiable method in Collections, but was to verbose)
        New method is .of: List.of, Set.of,Map.ofEntries (immutable)=> read only purpose
         */

        //Before: Unmodifiable before 9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        //courses.add("TS");
        System.out.println(courses);//UnsupportedOperationException

        //After java9: List.Of
        List<String> myCourses= List.of("Java","Spring","Agile");
        // Set.of
        Set<String> myCourses2= Set.of("Java","Spring","Agile");
        //Map
        Map<String, Integer> myCart= Map.ofEntries(
                Map.entry("Samsung",1),
                Map.entry("Apple",2),
                Map.entry("Nokia",1)
        );










    }
}
