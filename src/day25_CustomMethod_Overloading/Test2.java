package day25_CustomMethod_Overloading;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArrayUtility.printEach(arr1);

        System.out.println("=====================");

        double [] arr2 = {1.5, 3.2, 4.1, 2.8, 5.5};
        ArrayUtility.printEach(arr2);

        System.out.println("=========================");

        char [] arr3 = {'a', 'd', 'r', 'z'};
        ArrayUtility.printEach(arr3);

        System.out.println("==========================");

        String [] arr4 = {"Zarak", "Alam", "Zaiden", "Jaxon", };
        ArrayUtility.printEach(arr4);

        System.out.println("==============================");

        int[] n1 = {1,2,33,4,5,6};
        int max= ArrayUtility.maxNumber(n1);
        System.out.println("max number: " + max);

        System.out.println("=================================");

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.6};
        double maxNum = ArrayUtility.maxNumber(n2);
        System.out.println("maxNum = " + maxNum);

        System.out.println("==================================");

        int[] array = {1,2,3,4};
        boolean doesContain= ArrayUtility.contains(array,6);
        System.out.println("doesContain = " + doesContain);
        System.out.println("=======================");

        double[] array1 = {1.1, 2.1, .31, 4.1};
        boolean isContain = ArrayUtility.contains(array1,4.4);
        System.out.println(isContain);

        System.out.println("======================================");

        char[] charsArray = {'a', 'e', 'i', 'o', 'u'};
        boolean contain = ArrayUtility.contains(charsArray, 'e');
        System.out.println("contain = " + contain);

        System.out.println("==========================");

        String[] strArray = {"Java", "Python", "C++", "Selenium", "SQL"};
        boolean contains = ArrayUtility.contains(strArray, "Selenium");
        System.out.println("contains = " + contains);

        System.out.println("========================================");





    }






}
