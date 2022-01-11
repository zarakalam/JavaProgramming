package day26_CustomMethodsPractices;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqueElements_2nd {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));


    }

    //returns unique elements of an array
    public static int[] uniqueElements(int[] array){

        int[] result = {};

        for (int each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static double[] uniqueElements(double[] array){

        double[] result = {};

        for (double each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static char[] uniqueElements(char[] array){

        char[] result = {};

        for (char each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static String[] uniqueElements(String[] array){

        String[] result = {};

        for (String each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }






}
