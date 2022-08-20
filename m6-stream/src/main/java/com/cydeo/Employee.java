package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Employee {
    private int Id;//.stream<>
    private String name;
    private String email;
    private List<String> phoneNumber;// one employee can have more than one number .stream Stream<Stream<>>


}
