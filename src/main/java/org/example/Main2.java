package org.example;

public class Main2 {
    int x = 5;
    float d ;
    final int y = 10;
    String name = "John";
    String lname = "Doe";
    int age = 24;


    public static void main(String[] args) {
        Main2 myObj = new Main2();
        System.out.println(myObj.x);
        myObj.d = 1.23F;
        System.out.println(myObj.d);
        myObj.x = 20;
        System.out.println(myObj.x);
        //myObj.y = 20; genera error por que no puede remplazar el valor de la variable
        //System.out.println(myObj.y);

        System.out.println("Name: " + myObj.name + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }




}

