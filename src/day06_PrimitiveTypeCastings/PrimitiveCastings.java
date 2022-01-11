package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

     // implicit testing ex:

        byte a = 100;
        short b = a;

        int c = b;
     // int c = (int)b

        long d = c;
        // (long)c

        float e = d;

        double f = e;

        System.out.println(e + " : " +f);


        System.out.println("-----------------------------------");

     // explicit casting ex:


     int x = 55;
     short y = (short)x; //explicit casting

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short)j;

        System.out.println(j+ " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);


        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s);


        double d1 = 20.5;
        short s1 = (short) d1;  //windows shortcut - alt + enter - select cast to short
        // mac users - option + enter - select cast to short

        System.out.println(d1 + " : " + s1);


        float f1 = 30.5F;
        long l1 = (long) f1;




    }
}
