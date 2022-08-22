package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1= 374.56;
        double amount2 =374.26;
        System.out.println(amount1-amount2);//0.3000000000017......
        //after today, whenever we need double, we use BigDecimal
        //BigDecimal is a class


        System.out.println("           How to create BigDecimal          ");
        BigDecimal b1=new BigDecimal("374.56");// () Constructor
        BigDecimal b2=new BigDecimal("374.26"); // first way is new keyword
        BigDecimal b3 = BigDecimal.valueOf(374.56);// second way to Create BigDecimal - literal with valueOf
        System.out.println(b1.subtract(b2));//0.30
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 =BigDecimal.ONE;
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.00)));

        System.out.println("       Scaling                ");
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));


        class Employee{
            private String name;
            private BigDecimal salary;// no more regular double
        }










    }
}
