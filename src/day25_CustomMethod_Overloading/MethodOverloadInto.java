package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadInto {
    public static void main(String[] args) {

        int[] intArray= {5,6,0,-1,3,4};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("======================");

        double[] doubleArray = {10.5, 11.5 , 5.5, 4.5};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("======================");

        char[] charArray= {'e', 'f', 'b', 'd', 'c', 'a'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
        System.out.println("======================");

        int sumInt =sumOfNumbers(10,20,44);
        System.out.println(sumInt);
        double sumDouble= sumOfNumbers(1.7,3.6);
        System.out.println(sumDouble);

    }


    public static int sumOfNumbers(int num1, int num2){

        int sum= num1 + num2;

        return sum;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2){

        double sum= num1 + num2;

        return sum;
    }


}
