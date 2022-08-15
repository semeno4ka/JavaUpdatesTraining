package com.cydeo.farmerTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Apple {

    private Color color;// color is final that is why we created Enum for colors
    private int weight;


}
