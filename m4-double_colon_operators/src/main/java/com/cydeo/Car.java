package com.cydeo;

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
}
