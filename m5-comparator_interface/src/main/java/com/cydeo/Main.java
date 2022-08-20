package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
Comparator.compare() is a FI method used to sort a list of objects based on custom order
@FunctionalInterface
public interface Comparator<T>{
    int compare(T o1, T o2);

    public int compare (Obj o1, Obj o2){
    return -1(descending)
     return 1(ascending)
     return 0(equal)
     }
}
         */

        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        //Ascending
        Collections.sort(list);
        System.out.println(list);
        //Descending

        Collections.sort(list, new MyComparator());// behaviour parameterization
        System.out.println(list);// descending

        Collections.sort(list,(o1,o2)->(o1>02)?-1:(o1<02)?1:0);// we provide parameters, then implementation, pass this action inside another action

        //One method for All Compareto()
        //Ascending
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        //Descending
        list.sort((o2,o1)->o1.compareTo(o2)); // we have switched the order of parameters. thus the enrire structure and behaviour changes
        System.out.println(list);


    }
}
