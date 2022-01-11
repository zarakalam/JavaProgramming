package day27_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceAllElementWarmUpTask {

    public static void main(String[] args) {

        int[] arr = {10,10,20,30,40,30,30,30};

        arr=replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));

        arr=replaceAll(arr,300,500);

        System.out.println(Arrays.toString(arr));

        System.out.println("===============================");

        char[] arr1 = {'a', 'b', 'c', 'd', 'a', 'a'};

        char[] replace =replaceAll(arr1, 'a', 'z');
        System.out.println(Arrays.toString(replace));


    }


    //replaces all the old values with the new value in an array
    public static int[] replaceAll(int[] array, int oldValue, int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


        }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static double[] replaceAll(double[] array, double oldValue, double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


            }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static char[] replaceAll(char[] array, char oldValue, char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


            }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static String[] replaceAll(String[] array, String oldValue, String newElement){

        for (int i = 0; i < array.length; i++) {
            if( array[i].equals(oldValue) ){
                array[i] = newElement;


            }


        }

        return array;


    }





}
