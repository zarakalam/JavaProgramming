package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers1st {
    public static void main(String[] args) {

        //this is a division example...

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num1 = scan.nextInt();
        System.out.println("enter a number:");
        int num2 = scan.nextInt();

        int count = 0;

        while(num1>=num2){
            num1-=num2;
            count++;
        }

        System.out.println(count+ " with remainder of " + num1);

        scan.close();
        System.out.println("==========================================");


    }
}
