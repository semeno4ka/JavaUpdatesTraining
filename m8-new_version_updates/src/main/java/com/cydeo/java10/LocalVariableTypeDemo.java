package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    /*
    Type Inference: compiler is smart enough to detect the type of variable you are using in certain expressions
    f.e. "Cydeo" is obvious a String due to "" no need to specify=> car str="Cydeo", var number=15

    CAN only be used with LOCAL variable

     */

    public static void main(String[] args) {

   String str="Cydeo";
   var str2="Cydeo";
   var number=15;

   byte x=1;
   var y=1;// will detect as int, that is why in such cases it is better to specify if needed
   var price =12.50;

   List<Integer> numbers= Arrays.asList(3,4,5,6);
   var numbers2=Arrays.asList(7,8,9,10);
   var sum=0;
   for(var eachNum: numbers){
       sum=sum+eachNum;
   }



    }
}
