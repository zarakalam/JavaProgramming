package day13_StringClass;

import java.util.Scanner;

public class FirstLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String sentence = scan.nextLine();
        int totalChars = sentence.length();
        char f = sentence.charAt(0);
        char lastChar = sentence.charAt(totalChars -1);

        String firstLast = f + "" + lastChar;

        System.out.println("firstLast = " + firstLast);

        scan.close();



    }
}
/*

    1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */