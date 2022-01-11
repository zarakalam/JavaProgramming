package day15_ForLoop;

import java.util.Scanner;

public class ForLoopSumOfMultpNumScanner {
    public static void main(String[] args) {

       //for loop method to find sum for num 1 - 100

        int sum = 0;
        for (int i = 0; i <= 100; i+=1) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("===================================");

        //for loop scanner example... enter a number and find sum for 5 numbers

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i+=1) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }

        System.out.println(total);
        scan.close();


    }
}
