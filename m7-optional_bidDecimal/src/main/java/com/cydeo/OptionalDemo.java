package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

/*
Purpose: to prevent NullPointerException
Ity is a new Type of Data

 */

List<Integer> number = Arrays.asList(2,4,2,10,23);
//empty() - isPresent
        System.out.println("                   empty              ");
        Optional<String>empty= Optional.empty();// returns empty
        System.out.println(empty);
       // System.out.println(empty.get());
        // no object to get, NullPointerException must be shown, but instead it creates another New exception,
        // that displays that "No value present
        System.out.println("                isPresent                     ");
        System.out.println(empty.isPresent());// returns false if nothing is present

        System.out.println(Optional.of(number).isPresent());// This how can I conver List<Integer> number to Optional => Optional.of()
//true
        System.out.println("       test               ");
        number.stream().filter(x->x>100).forEach(System.out::println); // nothing gets printed
        System.out.println("       end test               ");

        System.out.println("             ifPresent                     ");
        //ifPresent
        Optional<Integer>bigNumber=number.stream().filter(x->x>100).findAny();
        System.out.println(bigNumber);// empty, because there are no number >100
        bigNumber.ifPresent(System.out::println);// didn't throw NullPointerException, just Optional.empty
       // System.out.println(bigNumber.get());//=> No value present, not NullPOinter

        System.out.println("             orElse                     ");
        System.out.println(bigNumber.orElse(5));//5 becomes a default value



    }
}
