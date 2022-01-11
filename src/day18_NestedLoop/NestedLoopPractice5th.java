package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice5th {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Enter your age");
            int age = scan.nextInt();

            while( ! (age>=1 && age <=120)){
                System.err.println("Invalid age, please re-enter");
                age= scan.nextInt();
            }

            if(age<18){
                System.out.println("You are not eligible to vote");
                break;

            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid entry, would like you to continue?");
                a= scan.next();
            }

            if(a.equals("no")){
                break;
            }

            System.out.println("Are you a US Citizen?");
            String citizen = scan.next().toLowerCase();

            while( ! (citizen.equals("yes") || citizen.equals("no")) ){
                System.err.println("Invalid entry, please re-enter");
                citizen = scan.next();


            }

            if(citizen.equals("no")){
                System.out.println("You are not eligible to vote");
                break;
            }else{
                System.out.println("You are eligible");
                break;

            }

        }




    }
}
