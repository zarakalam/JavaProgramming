package day10_NestedIf;

import java.sql.SQLOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 400;

        if(score >= 0 && score <= 100) {// if score is valid
            if (score >= 60) { //
                System.out.println("Passed");
            } else {
                System.out.println("Failed");

            }

        }else{
            System.out.println("Invalid Score");
        }


        System.out.println("---------------------");

        int age = 19;
        boolean hasId = true;

        if(hasId){ //if the person has ID

            if(age >= 21) {  //if the person is 21 yoa or older
                System.out.println("Eligible to buy alcohol");
            }else{  //if the person is less than 21 yoa
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ //if the person does not have an ID
            System.out.println("You must have ID to buy alcohol");
        }


        System.out.println("--------------------------------");

        int number = 8;

        if(number >=1 && number <=7){   //if the number is a valid between 1-7

            if(number == 1) {
                System.out.println("Monday");
            }else if(number == 2) {
                System.out.println("Tuesday");
            }else if(number == 3) {
                System.out.println("Wednesday");
            }else if(number == 4) {
                System.out.println("Thursday");
            }else if(number == 5) {
                System.out.println("Friday");
            }else if(number == 6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }


        }else{ //if the number is not valid
            System.out.println("Invalid Number");
        }





    }
}
/*

 */