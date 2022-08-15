package com.cydeo.farmerTask;

public interface ApplePredicate {

    boolean test(Apple apple);// true or false if green, true or false >200 or not
    // it is functional interface, if we addd one more method, it will give compile error

}
