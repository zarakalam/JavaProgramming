package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    // boolean scan example... you can only input true or false

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter True or False");

        boolean result = scan.nextBoolean();

        System.out.println("Enter your name: ");
        String name = scan.next(); // only prints until you hit space i.e John will print, however John Doe will not.

        System.out.println("name = " + name);

        scan.close();

    }
}
