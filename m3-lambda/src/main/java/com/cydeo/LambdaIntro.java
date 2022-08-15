package com.cydeo;

public class LambdaIntro {
    /*
    Introduced in Java 8
    Was good in OOP, but was missing Functional Programming
    Lambda: enabled functional programming
            more readable code structure

    In Java everything is Object. You cannot have some individual actions alone.
    If you want an action, you need to write a class then create object, then call it(function/method)


    Lambda: are just functions. They do n ot belong to any class
            These functions can be assumed as values
            String name = "Ozzy";
            int x = 5;
            ...(What will be the type of variable?)
            Initial version
            abc = public void sort(){
            statement
            }
           public - no need, because doesn't belong to any class
           sort - method name v- no object created, no need
           return type - Compiler configure out by looking at the code - no need for return type
           Introduced to key -> to show that it belongs to lambda

           Result:
            abc=()->{
            System.out.println("Hello world")
            }

            if it is one line; no need for curly braces as well
            abc=()-> System.out.println("Hello world")

            sorting(abc);
            sorting( ()-> System.out.println("Hello world"););

            Function that takes argu,ents:
            public boolean test(Apple apple){
            return apple.getWeight()>200;
            }
            ...weightApple = (Apple apple)-> apple.getWeight()>200;

            test( (Apple apple)-> apple.getWeight()>200););
            test(weightApple); second way


            ...lengthCount = (String s )-> s.length;


            myFunction = (int x,int y) -> {
            System.out.println("Result");
            System.out.println("x+y");
            }// if more than one line Curly braces should be kept

            myLambda = () -> 42; => action doesn't accept parameter just returns 42

            Creating Lambda:
                - how to create?
                1. Create a new interface. If you have already interface, this is optional

                interface MyLambda{}

                2. Create a method, exact same signature with Lambda expression

                 interface MyLambda{
                 void print();
                 }
                 MyLambda abc = ()->System.out.println("Ozzy");

                 - what is Data Type? The interface

                 Can be used only in interfaces with ONE abstract methods( which is functional interface)
                 If there is more than one method, you should do it the way we did with farm apples

     */
}
