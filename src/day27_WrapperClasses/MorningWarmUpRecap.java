package day27_WrapperClasses;

import java.util.Arrays;

public class MorningWarmUpRecap {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        array1=replaceElement(array1,2,30);

        System.out.println(Arrays.toString(array1));
        System.out.println("===============================");

        String[] arr2 = {"Java", "Pyhton", "C++", "Ruby"};

        String[] replace= replaceElement(arr2, 2, "C#");

        System.out.println(Arrays.toString(replace));

    }






    public static int[] replaceElement ( int[] arr, int index, int element){

            if (index < 0 || index > arr.length - 1) {
                System.err.println("Invalid index: " + index );
                System.exit(0);
            }
        arr[index] = element;
        return arr;


    }


    public static double[] replaceElement ( double[] arr, int index, double element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    public static char[] replaceElement ( char[] arr, int index, char element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    public static String[] replaceElement ( String[] arr, int index, String element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("INvalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    }