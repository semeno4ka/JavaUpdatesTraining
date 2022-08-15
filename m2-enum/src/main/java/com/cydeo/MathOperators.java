package com.cydeo;

public enum MathOperators {

    ADDITION,SUBTRACTION, MULTIPLICATION, DIVISION;

    MathOperators() {
        System.out.println("Constructor"); // constructor can be added as well
        // in this case since each constant is an object of this enu, class, constructor will be executed 4 time for each constant
        // this Constructor can never be public, in most cases it is private
        // Constructor is needed to assign certain value to objects
    }
}
