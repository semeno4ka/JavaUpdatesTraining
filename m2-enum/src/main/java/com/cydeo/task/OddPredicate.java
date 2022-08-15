package com.cydeo.task;

public class OddPredicate implements UnaryPredicate<Integer>{ // T specification reqiured

    @Override
    public boolean test(Integer obj) {
        return obj%2!=0;
    }
}
