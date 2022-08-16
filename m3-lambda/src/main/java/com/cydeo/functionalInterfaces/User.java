package com.cydeo.functionalInterfaces;

import lombok.*;

//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
@Data // puts everything except AllArgConstructor, it creates NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;

}
