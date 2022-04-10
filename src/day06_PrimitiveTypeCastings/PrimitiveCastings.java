package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        /*
        double > float > long > int > short > byte

        smaller primitives can be directly assigned to larger primitive type

        larger primitives can NOT be directly assigned to smaller primitive types (need to be cast manually)
        */

        byte a = 100;

        short b = a; // short b = (short)a;  // implicit casting

        int c = b; // int c = (int)b;    // implicit casting

        long d = c;

        double e = d;

        System.out.println("----------------------------------------------");


        int x = 55;
        short y = (short)x;  // explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k);  // it gives " 1000000 : 16960 " at the terminal


        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s);

        System.out.println("----------------------------------------------");

        double d1 = 20.3;
        short s1 = (short) d1; // alt + enter sag tarafa otomatik olarak short u yazdirdi..kisayol..

        System.out.println(d1 + " : " + s1); // gives 20.3 : 20 at the terminal




    }
}
