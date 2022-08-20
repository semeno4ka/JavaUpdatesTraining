package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
// How to start stream from Array
        String[] courses = {"Java","Spring","Agile"};// => source
        Stream<String> courseStream=Arrays.stream(courses);//=> converted to stream

// How to start stream from Collection
        List<String> courseList=Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStreamCollection=courseList.stream();//=> converted to stream

// How to start stream from Class
List<Course> myCourses = Arrays.asList( new Course("Java",11),
        new Course("DS",101),
        new Course("MS",102)); //=> creating source
        Stream<Course> myCourseStream=myCourses.stream();//=> converted to stream






    }
}
