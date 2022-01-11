package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        // task print the numbers 15-45 on the same line using for loop method

        for(int i = 15; i <= 45; i +=1){
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Hello Chootia");

        System.out.println("==============||||||||||===============");
        // task print number from 100 - 50

        for(int i = 100; i >=50 ; i -=2){
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Hello!");
        System.out.println("====================================");

        //print all the even numbers between 1 - 55

        /*  for(int i = 1; i <=5 ; i+=1){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                 }
           }
              ^^ this  method above is FUCKING STUPID dont use it ^^
         */

        for(int i = 2; i<=55; i+=2){
            System.out.print(i + " ");
        }
            //waaaaaaay simpler method to use to solve task...

        System.out.println("\n" + "==============================================");

    }
}
