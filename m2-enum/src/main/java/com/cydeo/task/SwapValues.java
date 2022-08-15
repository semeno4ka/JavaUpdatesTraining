package com.cydeo.task;

import java.sql.SQLOutput;
import java.util.Arrays;

import static com.cydeo.task.Hometask_m1_m2.swap;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4,5};
        swapValues(a,0,2);
        System.out.println(Arrays.toString(a));
    }

    private static <T> void swapValues(T[] a, int i, int j) {
        T temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}
