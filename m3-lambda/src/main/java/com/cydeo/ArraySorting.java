package com.cydeo;

public class ArraySorting {// QuickSort,BubbleSOrt - ways to sort Array used before

    public static void main(String[] args) {

        ArraySorting as= new ArraySorting();
        QuickSort qs= new QuickSort();
        BuubleSort bs = new BuubleSort();
        as.sort(qs);// passed QS as behaviour
        as.sort(bs);//passed BS as behaviour

        Sorting quickSort = ()-> System.out.println("Quick Sorting");
        as.sort(quickSort);// passed lambda to method
        as.sort(()-> System.out.println("Quick Sorting"));// in this case QuickSort class and BubbleSort class are not needed
        // With Java 8 you have access to a bunch of ready functional interfaces, no need for interface creation
         // such as Predicate, we can directly pass action to method

    }
    private void sort(Sorting sorting){
        sorting.sort();// passed action to different object
    }
}
