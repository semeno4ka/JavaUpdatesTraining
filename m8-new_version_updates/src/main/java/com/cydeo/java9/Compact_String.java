package com.cydeo.java9;

public class Compact_String {
    public static void main(String[] args) {
        /*
        String is a sequence of char, every char is made of 2 bytes (UTF-16 coder). Strings took double the space they needed in Heap memory
       They switched from UTF-16 to Latin-1, which occupies 1 byte per char if a character can be representing with byte,
       if the character still requires more than a byte, it is automatically created with UTF-16
       Memory Performance related update
         */
        String abc="Cydeo";// it is no longer char[] value, it is byte[]value






    }
}
