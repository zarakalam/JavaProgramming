package day42_Exceptions;

public class MorningWorkout {


    // add \r in front of println for push or pull ups to keep everything on the same line
    // add \n to print statement stating completion

    public static void main(String[] args) {

        System.out.println("------------Push up Started--------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " +i);  // had to concate 'i' in order for the program to increase after every print
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n------------Push Up completed------------------");

        System.out.println("==========================================");

        System.out.println("---------Pull Ups Started-----------------");

        for (int i = 1; i <= 20 ; i++) {
            System.out.print("\rPull up "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

         //   sleep(2.5);   -----> that way you can avoid having to create the try and catch exception issue.

        }

        System.out.println("\n------------Pull Up completed------------------");



    }

    // sleep method to use in future, so you can avoid having to deal with exceptions when in selenium.

    public static void sleep(double seconds){
        try {
            Thread.sleep( (long) (seconds * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
