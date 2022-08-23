package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrow_Demo {
    /*
    combines get and isPresent in one code. to avoid NullPointerException with Optional
    Will probably replace get

    get doen't check if the element exist, it throws exception right away
    orElseThrow checks if element is Present, if yes, returns value, if not, throws exception

    Imagine using .get() method in your application in a lot of places, so if you get NoSuchElementException you
     won't be able to know from which .get() method it is coming, but with orElseThrow() you will be able to throw
     any exception you want in anywhere in your application, so that you can know exactly where 3exception is coming from.
     */
    public static void main(String[] args) {

        Optional<String> str = Optional.empty();
       // System.out.println(str.get());NoSuchElementException: No value present

        //Behind the scene
        if(str.isPresent()){
        System.out.println(str.get());
        }else{
         //exception handeling
        }

        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(()-> new RuntimeException()));



    }
}
