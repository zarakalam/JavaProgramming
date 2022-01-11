package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicatesWarmUpTask {

    public static void main(String[] args) {

        int[] arr= {1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4};

        arr=removeDuplicate(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("==========================");


        String[] words = {"Java", "Java", "Python","C#", "Java","Java",};

        words= removeDuplicate(words);
        System.out.println(Arrays.toString(words));



    }



    //removess all the duplicate elements within an array
    public static int[] removeDuplicate(int[] array){

        int[] result = {};

        for (int each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }


    //removess all the duplicate elements within an array
    public static double[] removeDuplicate(double[] array){

        double[] result = {};

        for (double each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }

    //removess all the duplicate elements within an array
    public static char[] removeDuplicate(char[] array){

        char[] result = {};

        for (char each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }

    //removess all the duplicate elements within an array
    public static String[] removeDuplicate(String[] array){

        String[] result = {};

        for (String each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }




}
