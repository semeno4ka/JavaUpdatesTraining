package com.cydeo.java11;

public class StringUpdate {
    /*
    isBlank()
    lines()
    repeat() accepts int to know the number of repeated times
    var now can be used inside Lambda, but not that important
     */
    public static void main(String[] args) {
        var str="Mike\n Ozzy\n Tom\nEmmy";
        str.lines().filter(x-> x.startsWith("M")).forEach(System.out::println);

    }
}
