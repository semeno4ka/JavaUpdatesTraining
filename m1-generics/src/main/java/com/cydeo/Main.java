package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //The Idea behind Generics. Before Java 5
        ArrayList<Integer> items = new ArrayList();
        // <Integer> -specification made it possible to filter what data type and what objects can and cannot be accepted
        // Prior to filtering adding any kind of Object was possible without compile error, but the code should have been written for every possible situation with any data type
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        // items.add("Apple"); accepted String, since it's an Object. No specifications on what should be a data type were used
        // Filtering required, since you are writing code for Integers and you do not want anyone to inout any other data type
        printDoubled(items);
        System.out.println("------------------------");
        FootballPlayer joe=new FootballPlayer("joe");// joe registered himself as football player
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<SoccerPlayer> liverpool=new Team("liverpool");// team accepts any object, filtering required
          /*
        liverpool.addPlayer(joe);
        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham); all are from different fields but in one team, no specification
         */
        // liverpool.addPlayer(joe);
        // liverpool.addPlayer(pat); will show compile error when we introduce specification to team as <Soccer>, since both are not soccer
        liverpool.addPlayer(beckham);// all are from different fields but in one team, no specification

        //Team<String> brokenTeam = new Team<>("what kind of team si this?");
        // No compile error, since String is also a T-type of a class, T can accept an Object of any class

    }


    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer each : items ){// accepted any Object, had no restrictions to data type
            System.out.println(each*2);
        }
    }
}
