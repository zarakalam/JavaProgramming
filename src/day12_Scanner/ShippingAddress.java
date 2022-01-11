package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");

        String name = scan.nextLine();

        System.out.println("enter numeric to address");

        int numbers = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");

        String street = scan.nextLine();

        System.out.println("Enter your CIty name");

        String city = scan.nextLine();

        System.out.println("Enter your state");

        String state = scan.nextLine();

        System.out.println("enter your zip");

        int zip = scan.nextInt();
        scan.nextLine();

        System.out.println(name + "\n" + numbers + " " + street + "\n" + city + ", " + state + " " + zip );

        scan.close();

    }
}
/*
    enter your full name
    enter your numerics to address
    enter your street name
    enter city name
    enter state abbrev.
    enter zip code

    display shipping address
 */