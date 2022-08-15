package com.cydeo;

public abstract class Player {
    private String name;
    // stores info, not for creating objects
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
