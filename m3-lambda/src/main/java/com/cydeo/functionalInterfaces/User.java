package com.cydeo.functionalInterfaces;

import lombok.*;

//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
@Data // puts everything except AllArgConstructor, it creates NoArgsConstructor, as well as all required getters/setters,tostring
@AllArgsConstructor// if you manually add AllArg, you have then manually inout Noarg again, otherwise it gets deleted from Data(Only if you need both)
public class User {

    private String firstName;
    private String lastName;
    private int age;

}
