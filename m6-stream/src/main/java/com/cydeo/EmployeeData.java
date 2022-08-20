package com.cydeo;

import com.cydeo.Employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readALl(){ // assign it as Stream, so that we do not have to type .stream() every time we need stream
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("22200202","239203984")),
                new Employee(101,"Misha","misha@cydeo.com", Arrays.asList("22203402","239203344")),
                new Employee(102,"Shannon","shannon@cydeo.com", Arrays.asList("24500202","245203984"))
        );
    }
}
