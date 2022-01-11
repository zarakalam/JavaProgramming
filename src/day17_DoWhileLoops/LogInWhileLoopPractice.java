package day17_DoWhileLoops;

import java.util.Scanner;

public class LogInWhileLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if(userName.equals("Cydeo") && password.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else{
            int attempts =3;


            while( !(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempts>0){
                         /*if(attempts==1){
                                System.out.println("One attempt remaining");
                               }
                             */
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                userName= scan.next();
                System.out.println("Enter your password");
                password = scan.next();
                attempts--;
            }

            if(userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
            }
        }

        scan.close();

    }
}
