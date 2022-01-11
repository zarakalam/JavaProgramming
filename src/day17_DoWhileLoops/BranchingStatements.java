package day17_DoWhileLoops;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {

            if(i == 'F'){
                break; // this will stop the loop at the letter "F".. prints A-E
                //if you write the if statement after the print statement, then it will print F as well
            }

            System.out.print(i+ " ");

        }
        System.out.println("===============================");

        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num < 0){
                break; // this loop will only stop when an negative number is entered.
            }

        }

    }
}
