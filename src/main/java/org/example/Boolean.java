package org.example;

public class Boolean {
    public static void main(String[] args) {
        //---
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //------
        int x = 10;
        int y = 9;
        System.out.println(x > y);

        //--
        System.out.println(10 > 9);

        //---
        int d = 10;
        System.out.println(d == 10);

        //------
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        //--------
        int myAge2 = 25;
        int votingAge2 = 18;
        if (myAge2 >= votingAge2) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

    }
}
