package com.cydeo.java14;

import java.util.Scanner;

public class SwitchExpressions {
    /*
Simplification of Switch
     */
    public static void main(String[] args) {
// BEFORE
        var month =4;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }
        System.out.println("*********************************************");
//JAVA 14
        switch(month){ // NO BREAK ANYMORE, uses Lambda
            case 1,3,5,7,8,10,12-> System.out.println("31 Days");
            case 4,6,9,11-> System.out.println("30 Days");
            case 2-> System.out.println("28 or 29 Days");
            default-> System.out.println("Invalid month");
        }
        System.out.println("*********************************************");
int day;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               day=30;
                break;
            case 2:
                day=29;
                break;
            default:
               throw new IllegalArgumentException("Invalid month");
        }
        System.out.println(day);
// Will be
        int day1 = switch(month){ // NO BREAK ANYMORE, uses Lambda
            case 1,3,5,7,8,10,12-> 31;
            case 4,6,9,11-> 30;
            case 2-> 29;
            default-> 0;
        };
        System.out.println(day1);
        System.out.println("******************* Yield Feature **************************");
        // if you want to return a value without writing variable name once again, same as return in method
        int day2 = switch(month){
            case 1,3,5,7,8,10,12-> 31;
            case 4,6,9,11-> 30;
            case 2-> {
                Scanner scanner= new Scanner(System.in);
                System.out.println("Enter year");
                int year=scanner.nextInt();
                if(year%4==0)
                    yield 29;//new keyword
                else
                    yield 28;// one line only no curly braces allowed
            }
            default-> 0;
        };
        System.out.println(day2);
    }
}
