package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;


    public static ArrayList<Integer> numbers; // due to their being multiplr steps to set an array list, create it in the static block... see below

    public Circle(double radius){
        this.radius=radius;
      //  pi=3.14;   --> not the best practice to use static variable inside a constructor... never do it please

    }



    static{   //see TEST class to see how to print the static data in another file...
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }


    public static void main(String[] args) {
        pi=3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }






}
