package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2nd {
    public static void main(String[] args) {

        //store the elements 10,20, 50 , 70

        int[] number = {10, 20, 50, 70};
        System.out.println(Arrays.toString(number));
        System.out.println("==================================");

        //create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[0]=65;
        scores[2]=55;
        scores[1]=85;
        scores[3]= 75;
        scores[4]=95 ;
        //scores[scores.length-1]

        System.out.println(Arrays.toString(scores));
        System.out.println("==================================");

        //print each month on a sep line

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        /*
             System.out.println(month[0]); // jan
             System.out.println(month[1]); // feb.. etc for 11x
                     */

        for (int i = 0; i < month.length; i++) { //i: here represents index numbers starting from 0
            System.out.println(month[i]);

        }
        System.out.println("=======================");

            // will print the months from 12-1

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.println(month[i]);

        }


    }
}
