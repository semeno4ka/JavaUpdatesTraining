package com.cydeo.doubleColon;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
/*
        Predicate<Integer> pred= (p)-> p%2==0?true:false;
        (p)-> p%2==0?true:false; implementation of abstract method which belongs to functional interface
        We check the method signature to with FI abstract method signature to figure out which ready to use interface  we should look for
        FI- is an interface which accepts only one abstract method(there can be other methods, but never more than one abstract)
        USE verbal power of explanation during interview!!!*/

        BiConsumer<Integer,Integer> add= (x,y)-> System.out.println(x+y);// if you don't have your own interface
        Calculate calc= (x,y)->System.out.println(x+y);

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
        // Above example References static method (accessed through class name, Func Interface Varname = ClassName:: methodName) no parameters needed
        //parameters are given when you pass the method: varName.AbstractMethodName(parameters);

        //Reference to Instance Method: (accessed through object, Func Interface Varname = new Object/existing Object:: methodName)no parameters needed
        //parameters are given when you pass the method: varName.AbstractMethodName(parameters);
        Calculate c3 = new Calculator()::findMultiply; // since it is instance, we have to create object to call method
        //or
        Calculator obj=new Calculator();
        Calculate c4=obj::findMultiply;// directly through existing object

        //Examples on existing functional interfaces
        BiFunction<String,Integer,String> func= (str,i)->str.substring(i);// lambda way
        // we can use :: because lambda expression is referencing already existing method=> substring()
        BiFunction<String,Integer,String> func2= String::substring;//comes from class String. It's all it takes, the rest compiler recognizes

        Function<Integer,Double> func3= new MyClass()::method;// call through object, because compiler doen/t know which class the object will belong to
        BiFunction<MyClass,Integer,Double> func4= MyClass::method;
        // we don't need to call through object,can do it through class,because compiler knows the class the Object belongs to beforehand,(MyClass) since it is passed as parameter (T,U,R)
        // thus it will understand the Object

         Consumer <Integer> display = i->System.out.println(i);
         Consumer <Integer> display2 = System.out::println; // can use double colon operator from the beginning
         display2.accept(25);

         /*Implementation with Constructor :: (Check CarTest)
         If required Functional Interface Does not exist, for example for 4 arguments constructor, you can create it yourself

         @FunctionalInterface
         public interface TriFunction<T,U,V,R>{
         R apply(T t, U u, V v)
          }
     */


    }
}
