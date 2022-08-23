package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {

        User user =new User("Mike","Virginia");
        System.out.println(user.name());// getter with original name
        System.out.println(user.toString());
        System.out.println(user.address());



    }
}
