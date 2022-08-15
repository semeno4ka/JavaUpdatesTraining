package com.cydeo.task;

import java.util.Arrays;

public class Hometask_m1_m2 {

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        String[] arr2 ={"milk","fire","chill","focus"};
        System.out.println(Arrays.toString(swap(arr,0,3)));
        System.out.println(Arrays.toString(swap(arr2,2,3)));
    }

    public static <T> T[] swap(T[] a, int index, int index2){
        T[] temp= (T[]) new Object[2];

        temp[0]=a[index];
        temp[1]=a[index2];
        a[index]=temp[1];
        a[index2]=temp[0];

        return a;
    }


}
