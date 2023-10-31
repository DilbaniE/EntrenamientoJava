package org.example;

public class TiposdeDatos {
    public static void main(String[] args) {
        //string
        String name = "John";
        System.out.println("Hello " + name);

        //strin concatenacion
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // multiple variables
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        int f = 5, g = 6, k = 50;
        System.out.println(f + k + g);

        byte myNum = 100;
        System.out.println(myNum);

        // identificadores de variables
        int minutesPerHour = 60;
        int m = 60;

        String t = "texto";
        String texto = "texto completo";

        //tipos de datos

        short myNum2 = 5000;
        System.out.println(myNum2);

        int myNum3 = 100000;
        System.out.println(myNum3);

        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        // float y dooblue
        float myNum5 = 5.75f;
        System.out.println(myNum5);

        double myNum6 = 19.99d;
        System.out.println(myNum6);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);

        //si está familiarizado con los valores ASCII
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        // pasar un valor Automatic casting: int to double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //pasar un valor manualmente casting: double to int
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }

}
