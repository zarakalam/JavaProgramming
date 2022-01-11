package day11_Switch_Scanner;

public class DaysInWeekSwitchStatement {
    public static void main(String[] args) {

        //does not work with boolean, long, double, float  variable types
        // only use with data that you are comparing is equal or not

        int number = 9;

        switch (number){ // compare number to 1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; //exit the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //if placed at the end no need to add the break statement due to the ending curly brace
                System.out.println("Invalid");
                //break; // this break statement is not needed since it the last one.



        }
    }
}
