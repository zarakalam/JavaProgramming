package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtilityTwo2nd {
    public static void main(String[] args) {


        //Copy of Arrays method: will always start from index 0

        String[] students = {"Elif", "Sinem", "Gunnay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println( Arrays.toString(earlyBirds));
        System.out.println("===========================================");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);
        System.out.println( Arrays.toString(numbers));
        System.out.println("=================================");


        //Copy of Range Method - can give a starting point and will print out from starting to given ending point

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 7); //adding 0 in front of the starting & ending will print out the same results when you have unknown amount

        System.out.println( Arrays.toString(ch2));
        System.out.println("========================");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));

    }
}
