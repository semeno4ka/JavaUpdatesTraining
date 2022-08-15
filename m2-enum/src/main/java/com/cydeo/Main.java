package com.cydeo;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access constants");
        Currency a = Currency.DIME; // a becomes and object of currency class
        System.out.println(a);// will actuallu write the DIME, because toString is overridden
        System.out.println(Currency.PENNY);
        System.out.println("How to get all constants at a time");
        Currency[] currencies = Currency.values();// returns all the values. It is not Object creation, new keyword is nopt used
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
        System.out.println("How to use switch case with enum");
        switch(Currency.PENNY){ // looks for exact matching with the Constant
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }
        calculate(5,4,MathOperators.ADDITION);

        System.out.println("How to retrieve constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.ordinal());// returns index of Constants
    }
    public static void calculate(double a, double b, MathOperators mathOperator){
        switch (mathOperator){
            case ADDITION:
                System.out.println(a+b);
                break;
            case SUBTRACTION:
                System.out.println(a-b);
                break;
            case MULTIPLICATION:
                System.out.println(a*b);
                break;
            case DIVISION:
                System.out.println(a/b);
                break;
        }
    }


    }