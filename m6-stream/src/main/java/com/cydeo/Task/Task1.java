package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("              TASK #1 Char number                          ");
        //Given a list of words, print the number of characters in each word
        List<String> words= Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(each->each+" "+each.length())// or just each.length()
                .forEach(System.out::println);
    }
}
