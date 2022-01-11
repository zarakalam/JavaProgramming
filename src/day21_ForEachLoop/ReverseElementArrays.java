package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseElementArrays {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int[] reversed = new int[numbers.length]; // enter numbers.length because the reversal needs to match the initial length


        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j]=numbers[i];

        }

        /*
                 j       i
        reversed[0] = numbers[numbers.length-1];
        reversed[1]= numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];

         */

        System.out.println(Arrays.toString(reversed));

    }
}
/*

reverse the array and print out the new array with the same numbers

 */