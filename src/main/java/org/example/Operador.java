package org.example;

public class Operador {
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS (suma)
        int suma1 = 2;
        int suma2 = 4;
        int d = suma2 + suma1;
        System.out.println(d);

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;      // 800 (400 + 400)

        //resta
        int x = 5;
        int y = 3;
        System.out.println(x - y);

        //multi
        int h = 5;
        int f = 3;
        System.out.println(h * f);

        //divi
        int dd = 12;
        int w = 3;
        System.out.println(dd / w);

        //resto
        int q = 12;
        int a = 3;
        System.out.println(q % a);

        //incremento
        int t = 3;
        ++t;
        ++t;
        ++t;
        System.out.println(t);

        //decremento
        int s = 12;
        --s;
        --s;
        --s;
        --s;
        --s;
        System.out.println(s);

        //OPERADORES DE ASIGNACION
        int p = 10;
        p += 5;
        System.out.println(p);

        int v = 5;
        v += 3;
        System.out.println(v);

        int c = 5;
        c -= 3;
        System.out.println(c);

        int b = 5;
        b *= 3;
        System.out.println(b);

        int k = 5;
        k %= 3;
        System.out.println(k);

        //Operadores de comparacion boolean
        int xx = 5;
        int yy = 3;
        System.out.println(xx > yy);

        int xxx = 5;
        int yyy = 3;
        System.out.println(xxx == yyy); // returns false

        int m = 5;
        int n = 3;
        System.out.println(m > n); // returns true

        int r = 5;
        int e = 3;
        System.out.println(r < e); // returns false

        int u = 5;
        int i = 3;
        System.out.println(u >= i); // returns true

        int j = 5;
        int z = 3;
        System.out.println(j <= z);

        //OPERADORES LOGICOS
        int pp = 5;
        System.out.println( pp> 3 && pp < 10);// returns true

        int ll = 5;
        System.out.println(ll > 3 || ll < 4);// returns true because

        int aa = 5;
        System.out.println(aa > 3 || aa < 4);// returns false

        //Longitud de cuerda
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txto = "Hello World";
        System.out.println(txto.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txto.toLowerCase());   // Outputs "hello world"

        String txti = "Please locate where 'locate' occurs!";
        System.out.println(txti.indexOf("locate")); // Outputs 7

        // concatenacion
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}
