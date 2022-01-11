package day13_StringClass;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = scan.nextLine();

        System.out.println("Enter string 2: ");
        String str2 = scan.nextLine();

        int str1Length = str1.length();
        int str2Length = str2.length();

        if(str1Length>str2Length){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }

        scan.close();

    }
}

/*

    2. write a program that asks user to enter two strings, and print out the longest string

 */