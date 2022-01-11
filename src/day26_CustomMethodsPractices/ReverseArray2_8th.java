package day26_CustomMethodsPractices;

import utilities.ArrayUtility;

public class ReverseArray2_8th {


    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArrayUtility.addElement(result, array[i]);
        }

        return result;
    }

}

