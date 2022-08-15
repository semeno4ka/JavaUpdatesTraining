package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>{
    /* added <T> type for accepting a certain type of Objects. BUT should accept only player class and subclasses
     we specify that Objects can be only from classes which extend Player, not any class*/
        private String name;

        private List<T> members = new ArrayList();
        // changed Player to T, so that a certain type could be in the list

        public Team(String name) {
            this.name=name;
        }

        public boolean addPlayer(T player){ //changed Player to T, so that a certain type could be in the list
            if(members.contains(player)){
                System.out.println(((Player)player).getName() + " is already on the team"); // casting required for specification
                return false;// if already in the team, false, since addition will not be executed
            }else{
                members.add(player);
                System.out.println(((Player)player).getName() + " picked for team" + this.name);
                return true;// addition of a new member executed
            }
        }
}
