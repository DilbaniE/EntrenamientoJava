package org.example;
public class Condicion {
    public static void main(String[] args) {
        // condicionales IF AND ELSE IF TOO ELSE
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        //-------------------------------------------------------------
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        //-------------------------------------------------------------
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //-------------------------------------------------------------
        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //-------------------------------------------------------------

        int d = 50;
        int z = 10;
        if(d > z) {
            System.out.println("Hello World");
        }
        //-------------------------------------------------------------
        int time3 = 20;
        if (time3 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // TERNARIO
        int time4 = 20;
        String result = (time4 < 28) ? "Good day." : "Good evening.";
        System.out.println(result);

        // ternario
        int time5 = 20;
        String resultado =(time5 < 18) ? "Good day." : "Good evening.";
        System.out.println(resultado);


        //condicionales SWICH
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        int day2 = 4;
        switch (day2) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        int day3 = 6;
        switch (day3) {
           case 1:
            System.out.println("Saturday");
            break;
           case 2:
            System.out.println("Sunday");
            default:
                System.out.println("no hay dia");
        }
        //-------------------------------------------------------------
        // WHILE
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


        //-------------------------------------------------------------
        int e = 0;
        do {
            System.out.println(e);
            e++;
        }while (e < 5);
        //-------------------------------------------------------------------
        int t= 8;
        do{
            System.out.println(t);
            t++;
        }while(t < 16);

        //-----------------------FOR
        for (int r = 1; r <= 2; r++) {
            System.out.println("Outer: " + r); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        //---------------- bucle anidado
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                break;
            }
            System.out.println(l);
        }

        for (int g = 0; g < 10; g++) {
            if (g == 4) {
                continue;
            }
            System.out.println(g);
        }

        int c = 0;
        while (c < 10) {
            System.out.println(c);
            c++;
            if (c == 4) {
                break;
            }
        }

        int s = 0;
        while (s < 10) {
            if (s == 4) {
                s++;
                continue;
            }
            System.out.println(s);
            s++;
        }


    }
}
