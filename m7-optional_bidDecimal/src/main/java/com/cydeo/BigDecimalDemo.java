package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1= 374.56;
        double amount2 =374.26;
        System.out.println(amount1-amount2);//0.3000000000017......
   /*    after today, whenever we need double, we use BigDecimal
        BigDecimal is a class, creates Objects
        with BigDecimal "equals" cannot be used, instead Comparator=> compareTo() and other build-in methods
        Important note, that starting java10 releases are made TWICE a year, comparing to years waiting time before release in the past
        LTS vs Non-LTS: Long-Term Support. Some Versions are ready to use for a long-term,
        other,with shorter releases, are not suitable for long-term support, Oracle supports only till next release
        Only 3 year releases get Long support
        Java 8 has the longest support extended till 2030, 11-2026,17-2029
*/


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

        System.out.println("               compareTo()              ");
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));//0  equals
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));//1  greater
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));//-1 less






        class Employee{
            private String name;
            private BigDecimal salary;// no more regular double
        }










    }
}
