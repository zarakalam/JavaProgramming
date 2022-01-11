package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {


        /*
        write a program which will ask the user how many numbers they want to enter.
        if the number is less than 0 enter invalid entry and exit program.
        print the amount of the numbers entered as an array.
        print the MAX number entered.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("HOw many numbers would you like to enter?");
        int length = scan.nextInt();

        if(length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; //array needs to have enough capacity to contain all the elements user is going to input

        int max = numbers[0];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // each input the user provided during each execution of the loop, will be assigned to the indexes of the array

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        scan.close();

            }

        }


