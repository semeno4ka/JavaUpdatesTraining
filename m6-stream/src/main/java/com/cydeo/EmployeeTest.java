package com.cydeo;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails

        EmployeeData.readALl()
               // .map(each->each.getEmail())
                .map(Employee::getEmail) // this is preferred way, more clean and readable
                .forEach(System.out::println);

// Print all phone numbers
EmployeeData.readALl()
        .map(Employee::getPhoneNumber)
        .forEach(System.out::println);// returns Stream within []
        //to return just phone numbers need to use flatmap

        EmployeeData.readALl()
                .flatMap(each-> each.getPhoneNumber().stream())
                /* we need to add stream to List of phones to convert it to Stream of Stream,
                 since flatMap accepts Stream of Stream only and flattens the output*/
                .forEach(System.out::println);// returns Stream within []

// OPTION TO PRINT WITH :: using FLATMAP
        EmployeeData.readALl()
        .map(Employee::getPhoneNumber)
        .flatMap(List::stream)// stream is a method and is passed and List was the Class where phone numbers come from
        .forEach(System.out::println);


    }
}
