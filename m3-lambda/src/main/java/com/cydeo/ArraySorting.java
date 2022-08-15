package com.cydeo;

public class ArraySorting {// QuickSort,BubbleSOrt - ways to sort Array used before

    public static void main(String[] args) {

        ArraySorting as= new ArraySorting();
     QuickSort qs= new QuickSort();
     BuubleSort bs = new BuubleSort();
     as.sort(qs);// passed QS as behaviour
        as.sort(bs);//passed BS as behaviour

    }
    private void sort(Sorting sorting){
        sorting.sort();// passed action to different object
    }
}
