package com.cydeo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
/*
        Predicate<Integer> pred= (p)-> p%2==0?true:false;
        (p)-> p%2==0?true:false; implementation of abstract method which belongs to functional interface
        We check the method signature to with FI abstract method signature to figure out which ready to use interface  we should look for
        FI- is an interface which accepts only one abstract method(there can be other methods, but never more than one abstract)
        USE verbal power of explanation during interview!!!*/

        BiConsumer<Integer,Integer> add= (x,y)-> System.out.println(x+y);
        Calculate calc= (x,y)->System.out.println(5+6);

        Calculator.findSum(5,6);// same method from another class

        //Could turn both into:
        Calculate c = (x,y)-> Calculator.findSum(x,y);// inside method:(x,y)-> System.out.println(x+y);
        // for this situation, if the method implementation already exists in your files, you can
        // use this implementation by converting it to Lambda (pay attention to interface and parameters in example)
        // method return exactly what we needed (x,y)-> System.out.println(x+y);

        // For these situations, when a method implementation already exists, it' is better to use method, than write down the code fragment,
        // to make it understandable for compiler colon was introduces ::
        Calculate c2 = Calculator::findSum;// compiler sees that implementation is identical and thus doesn't require specification
        c2.calculate(5,6);
        // Above example References static method

        //Refference to Instance Method:

        Calculate c3 = new Calculator()::findMultiply; // since it is instance, we have to create object to call method
        //or
        Calculator obj=new Calculator();
        Calculate c4=obj::findMultiply;// directly through existing object


    }
}
