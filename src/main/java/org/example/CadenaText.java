package org.example;

public class CadenaText {
    public static void main(String[] args){

        String greeting ="Hello";

        String txt = "Hello";
        System.out.println(txt.length());

        String txt2 = "Hello";
        System.out.println(txt2.toUpperCase());

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName+lastName);

        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));

        String txt3 = "Hello Everybody";
        System.out.println(txt3.indexOf("e"));

    }
}
