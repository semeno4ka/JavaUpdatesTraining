package com.cydeo.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingMethods {
    /*
    static method teeing to Collectors interface and merges the result of two into one BiFunction
     */
    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(new Employee(123,"Tom",100),
                new Employee(124,"Mike",110),
                new Employee(125,"Sharon",115),
                new Employee(126,"Joe",120)
        );
        HashMap<String,Employee> result=employeeList.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                (e1,e2)->{
                    HashMap<String,Employee>map=new HashMap<>();
                    map.put("Max",e1.get());
                    map.put("Min",e2.get());
                    return map;
                }
        ));
        System.out.println(result);
    }

}
