package day17_DoWhileLoops;

import java.util.Scanner;

public class CalculatorWhileLoopEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:"); // + or - only
        char ch = scan.next().charAt(0); // re enter operator if anything else used but + or -

        while( !(ch == '+' || ch == '-')){
            System.err.println("Invalid entry, please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println( (ch == '+')? num1+num2 : num1-num2);


        scan.close();
    }
}
