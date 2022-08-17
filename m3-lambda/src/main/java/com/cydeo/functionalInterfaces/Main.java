package com.cydeo.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {



        List<User> users=new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Smoore",30));
        users.add(new User("Liza","Brown",29));
        users.add(new User("Misha","Gilmore",39));
        // print all
        users.forEach(user-> System.out.println(user));
        //print all that starts with L
        System.out.println();
        //or
        print(users,user->true);// no condition, if it is user, than print
        System.out.println();

        print(users,s-> s.getFirstName().startsWith("L"));
    }

    public static void print(List<User> users, Predicate<User> s){//you are going through user Objects
        for(User user: users){
            if(s.test(user)){// this returns true if it meets the condition you apply later with Lambda
                System.out.println(user.toString());
            }
        }
    }
}
