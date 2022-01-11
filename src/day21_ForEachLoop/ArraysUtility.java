package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};

        // toString method = prints out array to console
        System.out.println(Arrays.toString(num));
        System.out.println("===========================");

        // Arrays.sort() Method = sorts array in ascending order
        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores); //1st step
        System.out.println(Arrays.toString(scores)); //2nd step (Final result)
        System.out.println("Min score= " + scores[0]); // will give you minimum number
        System.out.println("Max score= " + scores[scores.length - 1]); //will give you max, make sure to include square bracket
        System.out.println("==================================");

        String[] names = {"Anna", "Zuhal", "Maria", "Ahmet", "Gunnay", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("=============================");

        //Arrays equals method
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2); //boolean result, so assign it to a boolean
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);
        System.out.println("=====================");

        // write a program to see if the following are annagrams;
        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(arr1,arr2);
        System.out.println("anagram = " + anagram);

        System.out.println("=======================");




    }
}
