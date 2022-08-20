package com.cydeo.doubleColon;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Car { // :: Implementation with Constructor
    private String name;
    private String model;

    public Car(String model) {
        this.model = model;
    }

    // If required Functional INterface Does not exist, for example for 4 arguments constructor, you can create it yourself
    /*
    @FunctionalInterface
    public interface TriFunction<T,U,V,R>{
    R apply(T t, U u, V v)
    }
     */
}
