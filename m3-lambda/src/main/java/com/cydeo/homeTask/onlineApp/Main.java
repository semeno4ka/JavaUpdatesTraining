package com.cydeo.homeTask.onlineApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("mike",35,Gender.MALE);
        Person p2 = new Person("joe",25,Gender.MALE);
        Person p3 = new Person("kate",15,Gender.FEMALE);
        Person p4 = new Person("liza",45,Gender.FEMALE);
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(p1,p2,p3,p4));
        //can print like this
        List<Person> groupList = Arrays.asList(p1,p2,p3,p4); //Important. New way of writing

        print(personList,person-> person.getAge()>18 && person.getGender().equals(Gender.MALE));
// cam also do:
        CheckMember a= person -> person.getGender().equals(Gender.MALE) && person.getAge()>18;


    }

    private static void print(List<Person> personList,CheckMember checkMember ){
        List<Person> result=new ArrayList<>();
        for(Person person:personList){
            if(checkMember.check(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
