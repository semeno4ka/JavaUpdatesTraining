package com.cydeo.java13;

public class TextBlocksDemo {
    /*

     */

    public static void main(String[] args) {

        var address ="7925 Jones Branch Drive\n McLean,VA 22102";

        System.out.println(address);

        //NOW
        var address2= """
                7925 Jones Branch Dr
                McLean,VA 22102
                """;// will be printed exactly the way I put it inside double triple double quotes

        System.out.println(address2);
    }
}
