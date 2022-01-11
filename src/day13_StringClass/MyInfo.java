package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your gender");

        String gender = scan.next();
        scan.nextLine();

        System.out.println("Enter your full name");

        String name = scan.nextLine();

        System.out.println("Enter your phone number");

        long phoneNum = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();
        scan.nextLine();

        System.out.println("Enter your building number");
        int address = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println(name + "\n" + age + "\n" + gender + "\n" + phoneNum + "\n" + "address:"
                           + "\n" + "\t" + "\t" + address + " " + street + "\n" + "\t" + "\t" + city + ", " + state + " " +
                           zipCode + "\n" + schoolName);

        scan.close();

    }
}
