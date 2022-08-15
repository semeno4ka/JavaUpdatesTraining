package com.cydeo;

public enum Currency {
    // special type of class holding final constants only

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);
    // all are objects from Currency classes, we avoid writing public static final CurrencyDemo PENNY
    private int value; // we will encapsulate the value so that it is not easily accessible

    Currency(int value) {
        this.value = value;
    }
    // Due to Constructor we can assign VALUE to Constants from the beginning

    public int getValue() {
        return value;
    }// getter required for readability
}
