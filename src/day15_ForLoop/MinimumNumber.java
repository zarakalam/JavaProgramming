package day15_ForLoop;


import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int minNum = 2147483647; // this number came from the integer primitive casting slide

        for (int i = 0; i < 5; i+=1) {
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if(num<minNum){
                minNum = num;
            }
        }

        System.out.println("minNum = " + minNum);

    }
}

/*

write a program that ask users to enter a number for 5 times.
    return the minimum number

 */