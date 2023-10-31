package org.example;

public class Matriz {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //bucle de arraiz
        int[] myNum = {10, 20, 30, 40};
        myNum[0] = 50;
        System.out.println(myNum[0]);
        for (int i : myNum) {
            System.out.println(i);
        }

        //matrices multidimensionales
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers2[1][2]); // Outputs 7


        int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers3[1][2] = 9;
        System.out.println(myNumbers3[1][2]);

        int[][] myNumbers4 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers4.length; ++i) {
            for(int j = 0; j < myNumbers4[i].length; ++j) {
                System.out.println(myNumbers4[i][j]);
            }
        }
    }
}
