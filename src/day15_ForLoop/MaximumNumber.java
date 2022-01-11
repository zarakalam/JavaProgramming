package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int maxNum = -2147483648; // this number came from the integer primitive casting slide

        for (int i = 0; i < 5; i+=1) {
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if(num>maxNum){
                maxNum = num;
            }
        }

        System.out.println("maxNum = " + maxNum);

    }
}
/*

    write a program that ask users to enter a number for 5 times.
    return the maximum number

 */