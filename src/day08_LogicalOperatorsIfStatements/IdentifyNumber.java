package day08_LogicalOperatorsIfStatements;

import java.sql.SQLOutput;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;

        boolean isTrue = number > 0;
        boolean isFalse = number <0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isTrue);
        System.out.println(number + " is negative number: " + isFalse);
        System.out.println(number + " is zero: " + isZero);


    }
}

/*1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

        Ex:
        number = 200

        output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false

 */