package day26_CustomMethodsPractices;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveElements2_4th {


    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers= removeElement(numbers,3);

        System.out.println(Arrays.toString(numbers));


    }




    public static int[] removeElement(int[] array, int index){

        if( index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result= ArrayUtility.addElement(result, array[i]);
            }

        }

        return result;

    }

    public static double[] removeElement(double[] array, int index){

        if( index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result=ArrayUtility.addElement(result, array[i]);
            }

        }

        return result;

    }

    public static char[] removeElement(char[] array, int index){

        if( index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result=ArrayUtility.addElement(result, array[i]);
            }

        }

        return result;

    }

    public static String[] removeElement(String[] array, int index){

        if( index<0 || index> array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result=ArrayUtility.addElement(result, array[i]);
            }

        }

        return result;

    }

}
