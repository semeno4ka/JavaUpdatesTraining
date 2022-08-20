package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero Argument Constructor
        Supplier<Car> c1=()->new Car();
        System.out.println(c1.get().getModel());// will print null because we didn't specify, but the object is created
        //:: Implementation
        //since it knows that the object belongs to Car class, we can apply  :: and access it through ClassName, not Object, because the Class is passed as parameter
        Supplier<Car> c2 = Car :: new;//new is passed as a method, because new creates Objects for constructor
        System.out.println(c2.get().getModel());

        //One Argument Constructor
        Function<String, Car> c3 = (model)-> new Car(model);
        Function<String, Car> c4 = Car::new;// constructor is called through new keyword, because it has same name as the Class, unlike methods which are called through methods name,
        // constructor is called through 'new'
        System.out.println(c3.apply("Accord"));
        System.out.println(c4.apply("Accord"));

        //Two argument Constructor
        BiFunction<String,String,Car> c5 = Car::new;// <String,String,Car> parameter, parameter, return type(car object)
        System.out.println(c5.apply("Honda","Accord"));
        BiFunction<String,String,Car> c6 = (name,model)->new Car(name,model);// parameters must be passed, because it is Constructor
        System.out.println(c6.apply("Toyota","Camry"));







    }
}
