package day21_ForEachLoop;

import java.util.Arrays;

public class StringArraysMethod8th {
    public static void main(String[] args) {

        //char array method: - returns a char array ex "ABC" --> 'A' 'B' 'C'

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for( char each : str.toCharArray() ){
            System.out.println(each);
        }


        System.out.println("===========================");

        //split method - returns string array
        //"I love learning java programming language".split(" ") --> ("I", "love", "learning", "java", "programming", "language"..)
        //"ABC".split("") --> "A" "B" "C"... to print the string as indv char? i think he said

        String sentence = "Wooden Spoon";
        //if you want to create string array, use split...

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("==============================");

        String email = "WoodenSpoon@cydeo.com";
        //get user name and domain;

        String[] arr  = email.split("@");
        System.out.println(Arrays.toString(arr));
        System.out.println("===============================");

        String s = "Today is a nice day. Today is Monday. Today we learn Java";
        String[] arr1 = s.split("\\. ");// if you want to split by a period make sure to use --> \\. <--
        System.out.println(Arrays.toString(arr1));



    }
}
